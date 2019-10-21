package com.ckordes.kindergarten2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private long id;
    private boolean homeWork;
    //    @NotBlank(groups = {ChildValidation.class, AdultValidation.class})
    private String street;
    //    @NotBlank(groups = {ChildValidation.class, AdultValidation.class})
    private String numberBuilding;
    private String numberFlat;
    //    @Pattern(regexp="\\d{5}")
    private int zipCode;
    //    @NotBlank(groups = {ChildValidation.class, AdultValidation.class})
    private String city;
    //    @NotBlank(groups = {ChildValidation.class, AdultValidation.class})
    private String voievodyship;

    public Address() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isHomeWork() {
        return homeWork;
    }

    public void setHomeWork(boolean homeWork) {
        this.homeWork = homeWork;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumberBuilding() {
        return numberBuilding;
    }

    public void setNumberBuilding(String numberBuilding) {
        this.numberBuilding = numberBuilding;
    }

    public String getNumberFlat() {
        return numberFlat;
    }

    public void setNumberFlat(String numberFlat) {
        this.numberFlat = numberFlat;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVoievodyship() {
        return voievodyship;
    }

    public void setVoievodyship(String voievodyship) {
        this.voievodyship = voievodyship;
    }
}
