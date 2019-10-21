package com.ckordes.kindergarten2.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class Group {
    @Id
    @GeneratedValue
    private long id;

    @NotBlank //(groups = {AdultValidation.class, ChildValidation.class})
    private String name;
    @ManyToMany//(fetch = FetchType.EAGER)
    private List<Child> childList;
    @NotBlank//
    private String description;
    @OneToMany//(fetch = FetchType.EAGER)
    private List<GroupInfo> groupInfoList;
    @ManyToMany
    private List<Teacher> teacherList;

    public Group() {
    }
}
