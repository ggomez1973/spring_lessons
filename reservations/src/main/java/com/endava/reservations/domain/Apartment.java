package com.endava.reservations.domain;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class Apartment {
    @Id
    @Type(type = "uuid-char")
    private final UUID id = UUID.randomUUID();
    private String description;
    private BigDecimal pricePerDay;

    public Apartment() {    }

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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
