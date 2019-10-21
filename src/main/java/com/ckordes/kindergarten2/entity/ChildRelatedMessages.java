package com.ckordes.kindergarten2.entity;

import javax.validation.constraints.NotBlank;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ChildRelatedMessages {

    @Id
    @GeneratedValue
    private long id;

    @NotBlank//(groups = {AdultValidation.class, ChildValidation.class})
    private String message;

    private LocalDateTime created;

    @PrePersist
    public void prePersist() {
        created = LocalDateTime.now();
    }

    public ChildRelatedMessages() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
