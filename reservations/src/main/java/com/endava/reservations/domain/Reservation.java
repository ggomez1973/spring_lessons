package com.endava.reservations.domain;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Reservation {
    @Id
    @Type(type = "uuid-char")
    private final UUID id = UUID.randomUUID();
    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;
    @ManyToOne
    @JoinColumn(name="apartment_id")
    private Apartment apartment;
    private LocalDate fromDate;
    private LocalDate toDate;

    public Reservation() {
    }

    public Reservation(Client client, Apartment apartment, LocalDate fromDate, LocalDate toDate) {
        this.client = client;
        this.apartment = apartment;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public UUID getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }
}
