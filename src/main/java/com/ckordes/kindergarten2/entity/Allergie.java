package com.ckordes.kindergarten2.entity;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.List;

@Entity
public class Allergie {
    @Id
    @GeneratedValue
    private  long id;

    @ManyToMany//(fetch = FetchType.EAGER)
    @JoinTable(name = "child_alergies", joinColumns = @JoinColumn(name = "allergie_id")
            , inverseJoinColumns = @JoinColumn(name = "child_id"))
    private List<Child> childList;
//    @NotBlank(groups = ChildValidation.class)
    private String typeOfAllergie;
}
