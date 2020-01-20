package com.example.client_side.Entities;

public class Parcel {
    private String parcelId;
    private ParcelType parcelType;
    private ParcelWeight parcelWeight;
    private ParcelStatus parcelStatus;
    private boolean fragile_content;
    private String locationStorage;
    private String delivery_date;
    private String receipt_date;
    private String phoneNumberOfRecipient;
    private String addressOfRecipient;
    private String firstNameOfRecipient;
    private String lastNameOfRecipient;
    private String emailAddOfRecipient;
    private String workerName;


    public Parcel() { }

    public void setParcelType(ParcelType parcelType) {
        this.parcelType = parcelType;
    }

    public void setFragile_content(boolean fragile_content) {
        this.fragile_content = fragile_content;
    }

    public void setParcelWeight(ParcelWeight parcelWeight) {
        this.parcelWeight = parcelWeight;
    }

    public void setLocationStorage(String locationStorage) {
        this.locationStorage = locationStorage;
    }

    public ParcelType getParcelType() {
        return parcelType;
    }

    public boolean isFragile_content() {
        return fragile_content;
    }

    public ParcelWeight getParcelWeight() {
        return parcelWeight;
    }

    public String getLocationStorage() {
        return locationStorage;
    }

    public String getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(String delivery_date) {
        this.delivery_date = delivery_date;
    }
    public String getReceipt_date() {
        return receipt_date;
    }
    public String getParcelId() {
        return parcelId;
    }
    public void setParcelId(String idParcel)

    {
        this.parcelId = idParcel;
    }

    public void setReceipt_date(String receipt_date) {
        this.receipt_date = receipt_date;
    }

    public String getPhoneNumberOfRecipient() {
        return phoneNumberOfRecipient;
    }

    public void setPhoneNumberOfRecipient(String phoneNumberOfR) {
        this.phoneNumberOfRecipient = phoneNumberOfR;
    }

    public String getAddressOfRecipient() {
        return addressOfRecipient;
    }

    public void setAddressOfRecipient(String addressOfR) {
        this.addressOfRecipient = addressOfR;
    }

    public String getFirstNameOfRecipient() {
        return firstNameOfRecipient;
    }

    public void setFirstNameOfRecipient(String firstNameOfR) {
        this.firstNameOfRecipient = firstNameOfR;
    }

    public String getLastNameOfRecipient() {
        return lastNameOfRecipient;
    }

    public void setLastNameOfRecipient(String lastNameOfR) {
        this.lastNameOfRecipient = lastNameOfR;
    }

    public String getEmailAddOfRecipient() {
        return emailAddOfRecipient;
    }

    public void setEmailAddOfRecipient(String emailAddrOfR) {
        this.emailAddOfRecipient = emailAddrOfR;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }
    public ParcelStatus getParcelStatus() {
        return parcelStatus;
    }

    public void setParcelStatus(ParcelStatus parcelStatus) {
        this.parcelStatus = parcelStatus;
    }

}


