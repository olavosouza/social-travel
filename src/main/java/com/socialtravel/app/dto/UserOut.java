package com.socialtravel.app.dto;

public class UserOut {

    private Long id;

    private String name;

    private String phoneNumber;

    private String document;

    private String email;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setDocument(final String document) {
        this.document = document;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setName(final String name) {
        this.name = name;
    }

}
