package com.endava.reservations.controllers.vos;

import com.endava.reservations.domain.Apartment;
import com.endava.reservations.domain.Client;

import java.time.LocalDate;
import java.util.UUID;

public class ReservationValueObject {
    public UUID clientId;
    public UUID apartmentId;
    public LocalDate fromDate;
    public LocalDate toDate;
}
