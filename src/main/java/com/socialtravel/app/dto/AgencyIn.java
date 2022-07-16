package com.socialtravel.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class AgencyIn {

    @NotEmpty
    private String name;

    @NotEmpty
    private String document;

    @Email
    @NotEmpty
    private String email;

    @NotEmpty
    private String telephoneNumber;

    @NotEmpty
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(final String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setTelephoneNumber(final String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(final String document) {
        this.document = document;
    }

}
