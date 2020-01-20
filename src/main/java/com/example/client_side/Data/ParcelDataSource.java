package com.example.client_side.Data;

import androidx.annotation.NonNull;

import com.example.client_side.Entities.Parcel;

import java.util.ArrayList;
import java.util.List;

import com.example.client_side.Entities.ParcelStatus;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.MutableData;
import com.google.firebase.database.ValueEventListener;

public class ParcelDataSource
{
    public interface NotifyDataChange<T>
    {
        void OnDataChanged(T obj);
        void onFailure(Exception exception);

    }
    static DatabaseReference parcelRef;
    static List<Parcel> parcelList;
    private static FirebaseAuth mAuth;
    private static ValueEventListener parcelRefValueEventListener,tmp;
    static
    {
        FirebaseDatabase database=FirebaseDatabase.getInstance();
        parcelRef=database.getReference("Parcels");
        parcelList=new ArrayList<>();
        mAuth=FirebaseAuth.getInstance();
    }
    public static void notifyToParcelList(final NotifyDataChange<List<Parcel>> notifyDataChange)
    {
        if(notifyDataChange!=null)
        {
            if(parcelRefValueEventListener!=null)
            {
                notifyDataChange.onFailure(new Exception("first unNotify parcel list"));
                return;
            }
            parcelList.clear();
            parcelRefValueEventListener=new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot)
                {
                    FirebaseUser user=mAuth.getCurrentUser();
                    int size=parcelList.size();
                    for (DataSnapshot data : dataSnapshot.getChildren()) {
                        Parcel parcel = data.getValue(Parcel.class);
                        if((parcel.getParcelStatus()== ParcelStatus.ON_WAY || parcel.getParcelStatus()==ParcelStatus.SOMEONE_OFFERED) && (user.getEmail()==parcel.getEmailAddOfRecipient()) )
                        {
                            if(!(parcelList.contains(parcel))){
                                parcelList.add(parcel);
                            }
                        }
                    }
                    if(size<parcelList.size()){//Update only after all the packages have come in and not on each package separately
                        notifyDataChange.OnDataChanged(parcelList);
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            };

            parcelRef.addValueEventListener(parcelRefValueEventListener);
        }
    }

    public static void stopNotifyToParcelList() {
        if (parcelRefValueEventListener!= null) {
            parcelRef.removeEventListener(parcelRefValueEventListener);
            tmp=parcelRefValueEventListener;
            parcelRefValueEventListener=null;
        }
    }
   /* public ArrayList<Parcel> parcelListForUser(String UserEmail)
    {

    }*/
}
