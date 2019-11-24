package com.ckordes.kindergarten2.entity;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
public class Role {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, unique = true)
    @NotEmpty
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
