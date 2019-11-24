package com.ckordes.kindergarten2.entity;

import javax.validation.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Parent {
    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    @NotNull//(groups = AdultValidation.class)
    private Person person;
    @NotBlank//(groups = AdultValidation.class)
    private String companyName;
    private boolean guardian;
    private boolean allowedToPickUp;
    @ManyToMany//(fetch = FetchType.EAGER)
    private List<Child> childList;

    public Parent() {
    }

    public Parent(Person person, @NotBlank String companyName, boolean guardian, boolean allowedToPickUp, List<Child> childList) {
        this.person = person;
        this.companyName = companyName;
        this.guardian = guardian;
        this.allowedToPickUp = allowedToPickUp;
        this.childList = childList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public boolean isGuardian() {
        return guardian;
    }

    public void setGuardian(boolean guardian) {
        this.guardian = guardian;
    }

    public boolean isAllowedToPickUp() {
        return allowedToPickUp;
    }

    public void setAllowedToPickUp(boolean allowedToPickUp) {
        this.allowedToPickUp = allowedToPickUp;
    }

    public List<Child> getChildList() {
        return childList;
    }

    public void setChildList(List<Child> childList) {
        this.childList = childList;
    }
}
