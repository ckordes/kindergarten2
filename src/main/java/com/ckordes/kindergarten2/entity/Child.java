package com.ckordes.kindergarten2.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Child {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne
//    @NotNull(groups = ChildValidation.class)
    private Person person;
    //    @NotNull(groups = ChildValidation.class)
    @ManyToMany(mappedBy = "childList")//, cascade = CascadeType.ALL)//,fetch = FetchType.EAGER
    private List<Parent> parentList;
    //    @NotEmpty(groups = ChildValidation.class)
    @ManyToMany(mappedBy = "childList")//, cascade = CascadeType.ALL)//,fetch = FetchType.EAGER
    private List<Group> groupList;
    //    @OneToMany//(mappedBy = "child")//, cascade = CascadeType.ALL)//,fetch = FetchType.EAGER)
//    private List<Payment> paymentList;
    @OneToMany//(mappedBy = "child")//,fetch = FetchType.EAGER)
    private List<ChildRelatedMessages> childRelatedMessagesList;
    @ManyToMany//(mappedBy = "childList")//,fetch = FetchType.EAGER)
    private List<Allergie> allergieList;
    @OneToMany//(mappedBy = "child")//,fetch = FetchType.EAGER)
    private List<InfoForTeacher> infoForTeachers;
    //    @NotBlank(groups = ChildValidation.class)
//    @Digits(integer = 6, fraction = 0)
//    private double startHour;
//    //    @NotBlank(groups = ChildValidation.class)
//    @Digits(integer = 6, fraction = 0)
//    private double endHour;

    public Child() {
    }

    public Child(Person person, List<Parent> parentList, List<Group> groupList, List<ChildRelatedMessages> childRelatedMessagesList, List<Allergie> allergieList, List<InfoForTeacher> infoForTeachers) {
        this.person = person;
        this.parentList = parentList;
        this.groupList = groupList;
        this.childRelatedMessagesList = childRelatedMessagesList;
        this.allergieList = allergieList;
        this.infoForTeachers = infoForTeachers;
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

    public List<Parent> getParentList() {
        return parentList;
    }

    public void setParentList(List<Parent> parentList) {
        this.parentList = parentList;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public List<ChildRelatedMessages> getChildRelatedMessagesList() {
        return childRelatedMessagesList;
    }

    public void setChildRelatedMessagesList(List<ChildRelatedMessages> childRelatedMessagesList) {
        this.childRelatedMessagesList = childRelatedMessagesList;
    }

    public List<Allergie> getAllergieList() {
        return allergieList;
    }

    public void setAllergieList(List<Allergie> allergieList) {
        this.allergieList = allergieList;
    }

    public List<InfoForTeacher> getInfoForTeachers() {
        return infoForTeachers;
    }

    public void setInfoForTeachers(List<InfoForTeacher> infoForTeachers) {
        this.infoForTeachers = infoForTeachers;
    }

    public String getFullName() {
        return person.getFirstName() + " " + person.getLastName();
    }
}
