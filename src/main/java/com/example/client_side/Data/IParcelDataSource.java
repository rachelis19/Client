package com.example.client_side.Data;

import com.example.client_side.Entities.Parcel;

import java.util.ArrayList;

public interface IParcelDataSource
{
    ArrayList<Parcel> parcelListForUser(String UserEmail);
    void ApprovedDeliveryPerson(Parcel parcel);
    void ApprovedParcel(Parcel parcel);
    ArrayList<Parcel> RelevantParcels(int x,String UserEmail);
    void OfferDeliveryPerson(String UserEmail);

}
