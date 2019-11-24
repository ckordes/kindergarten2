package com.ckordes.kindergarten2.entity;

import org.hibernate.validator.constraints.pl.PESEL;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true)
    @NotBlank//(groups = {ChildValidation.class, AdultValidation.class})
    @PESEL//(groups = {ChildValidation.class, AdultValidation.class})
    private String pesel;
    @NotBlank//(groups = {ChildValidation.class, AdultValidation.class})
    private String firstName;
    private String secondName;
    @NotBlank//(groups = {ChildValidation.class, AdultValidation.class})
    private String lastName;
    @NotBlank//(groups = AdultValidation.class)
    private String idNumber;
    @NotNull//(groups = {ChildValidation.class, AdultValidation.class})
    @OneToOne //( cascade = {CascadeType.ALL})
    private Address homeAddress;
//    @NotNull//(groups = AdultValidation.class)
    @OneToOne //( cascade = {CascadeType.ALL})
    private Address workAddress;
//    @NotBlank//(groups = AdultValidation.class)
    @Email//(groups = AdultValidation.class)
    @Column(unique = true)
    private String email;
    @NotBlank//(groups = AdultValidation.class)
    private String password;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "person_role", joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public Person() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
