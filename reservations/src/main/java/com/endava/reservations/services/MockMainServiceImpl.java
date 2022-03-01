package com.endava.reservations.services;

import com.endava.reservations.controllers.vos.ReservationValueObject;
import com.endava.reservations.domain.Apartment;
import com.endava.reservations.domain.Client;
import com.endava.reservations.domain.Reservation;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

//@Service("mock")
public class MockMainServiceImpl implements MainService{
    @Override
    public Client getClientById(UUID id) {
        return null;
    }

    @Override
    public List<Client> getAllClients() {
        return null;
    }

    @Override
    public Client saveClient(String name) {
        return null;
    }

    @Override
    public Apartment getApartmentById(UUID id) {
        return null;
    }

    @Override
    public List<Apartment> getAllApartments() {
        return null;
    }

    @Override
    public Apartment saveApartment(String description, BigDecimal pricePerDay) {
        return null;
    }

    @Override
    public Reservation makeReservation(ReservationValueObject reservation) {
        return null;
    }

    @Override
    public List<Reservation> getAllReservations() {
        return null;
    }
}
