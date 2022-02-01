package com.endava.reservations.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Type;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Client {
    @Id
    @Type(type = "uuid-char")
    private final UUID id = UUID.randomUUID();
    private String firstName;

 //   @OneToMany(mappedBy="client", cascade = CascadeType.MERGE)
 //   private final List<Reservation> reservations = new ArrayList<>();

    public Client() {
    }

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
