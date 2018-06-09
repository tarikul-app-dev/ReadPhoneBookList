package com.example.tarikul.readphonebook;

/**
 * Created by Tarikul on 6/7/2018.
 */

public class ContactModel {
    public ContactModel(String userName, String contactNumber) {
        this.userName = userName;
        this.contactNumber = contactNumber;
    }

    public String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String contactNumber;



}
