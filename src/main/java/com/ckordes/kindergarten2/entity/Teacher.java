package com.ckordes.kindergarten2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Teacher {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne//(cascade = {CascadeType.MERGE,CascadeType.REMOVE})//(fetch = FetchType.EAGER)
    @NotNull//(groups = AdultValidation.class)
    private Person person;

    public Teacher() {
    }
}
