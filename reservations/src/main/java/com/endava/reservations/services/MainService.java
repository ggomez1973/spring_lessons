package com.endava.reservations.services;

import com.endava.reservations.controllers.vos.ReservationValueObject;
import com.endava.reservations.domain.Apartment;
import com.endava.reservations.domain.Client;
import com.endava.reservations.domain.Reservation;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;


public interface MainService {
    Client getClientById(UUID id);
    List<Client> getAllClients();
    Client saveClient(String name);
    Apartment getApartmentById(UUID id);
    List<Apartment> getAllApartments();
    Apartment saveApartment(String description, BigDecimal pricePerDay);
    Reservation makeReservation(ReservationValueObject reservation);
    List<Reservation> getAllReservations();
}
