package com.ocean.volleyasyncrecycldemoapp;

public class ProfileDetailsModel {

    private String customer_name;
    private String email_id;
    private String contact;
    private String customer_id;

    public ProfileDetailsModel(String customer_name, String email_id, String contact, String customer_id) {
        this.customer_name = customer_name;
        this.email_id = email_id;
        this.contact = contact;
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }
}
