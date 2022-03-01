package com.endava.reservations.domain;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Client {
    @Id
    @Type(type = "uuid-char")
    private final UUID id = UUID.randomUUID();
    private String firstName;

    public Client() {    }

    public Client(String firstName) {
        this.firstName = firstName;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
