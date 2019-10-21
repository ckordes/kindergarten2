package com.ckordes.kindergarten2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Phone {

    @Id
    @GeneratedValue
    private long id;

    @NotBlank
    private int phoneNumber;
    private boolean privateNumber;

    public Phone() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isPrivateNumber() {
        return privateNumber;
    }

    public void setPrivateNumber(boolean privateNumber) {
        this.privateNumber = privateNumber;
    }
}
