package com.endava.reservations.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Apartment {
    @Id
    @Type(type = "uuid-char")
    private final UUID id = UUID.randomUUID();
    private String description;
    private BigDecimal pricePerDay;

    @OneToMany(mappedBy="apartment")
    @JsonIgnore
    private final List<Reservation> reservations = new ArrayList<>();

    public Apartment() {
    }

    public Apartment(String description, BigDecimal pricePerDay) {
        this.description = description;
        this.pricePerDay = pricePerDay;
    }

    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void addReservation(Reservation reservation){
        reservations.add(reservation);
    }
}
