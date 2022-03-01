package com.endava.reservations.services;

import com.endava.reservations.controllers.vos.ReservationValueObject;
import com.endava.reservations.domain.Apartment;
import com.endava.reservations.domain.Client;
import com.endava.reservations.domain.Reservation;
import com.endava.reservations.persistance.ApartmentsRepository;
import com.endava.reservations.persistance.ClientsRepository;
import com.endava.reservations.persistance.ReservationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
@Primary
public class DefaultMainServiceImpl implements MainService {
    // @Autowired   // NOOO!!! Field Injection
    private ClientsRepository clientsRepository;
    private ApartmentsRepository apartmentsRepository;
    private ReservationsRepository reservationsRepository;

    @Autowired
    public void setClientsRepository(ClientsRepository clientsRepository) {
        this.clientsRepository = clientsRepository;
    }

    @Autowired
    public void setApartmentsRepository(ApartmentsRepository apartmentsRepository) {
        this.apartmentsRepository = apartmentsRepository;
    }

    @Autowired
    public void setReservationsRepository(ReservationsRepository reservationsRepository) {
        this.reservationsRepository = reservationsRepository;
    }

    @Override
    public Client getClientById(UUID id) {
        return clientsRepository.findById(id).orElseThrow(ClientNotFoundException::new);
    }

    @Override
    public List<Client> getAllClients() {
        return (List<Client>) clientsRepository.findAll();
    }

    @Override
    public Client saveClient(String name) {
        Client client = new Client(name);
        return clientsRepository.save(client);
    }

    @Override
    public Apartment getApartmentById(UUID id) {
        return apartmentsRepository.findById(id).orElseThrow(ApartmentNotFoundException::new);
    }

    @Override
    public List<Apartment> getAllApartments() {
        return (List<Apartment>) apartmentsRepository.findAll();
    }

    @Override
    public Apartment saveApartment(String description, BigDecimal pricePerDay) {
        Apartment apartment = new Apartment(description, pricePerDay);
        return apartmentsRepository.save(apartment);
    }

    @Override
    public Reservation makeReservation(ReservationValueObject vo) {
        // Reglas de negocio!!
        Client client = getClientById(vo.clientId);
        Apartment apartment = getApartmentById(vo.apartmentId);
        Reservation reservation = new Reservation(client, apartment, vo.fromDate, vo.toDate);
        return reservationsRepository.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return (List<Reservation>) reservationsRepository.findAll();
    }
}
