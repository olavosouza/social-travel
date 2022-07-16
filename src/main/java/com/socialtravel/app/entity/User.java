package com.socialtravel.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String phoneNumber;

    private String document;

    @Email
    private String email;

    // add picture in S3 and save the link to the picture in database
    //private String picture;


    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getDocument() {
        return document;
    }

    public Long getId() {
        return id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDocument(final String document) {
        this.document = document;
    }

}
