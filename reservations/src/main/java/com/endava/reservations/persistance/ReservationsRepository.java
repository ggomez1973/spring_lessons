package com.endava.reservations.persistance;

import com.endava.reservations.domain.Client;
import com.endava.reservations.domain.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface ReservationsRepository extends CrudRepository<Reservation, UUID> {
    List<Reservation> findByClient(Client client);
}
