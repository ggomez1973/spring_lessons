package com.endava.reservations.persistance;

import com.endava.reservations.domain.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ReservationsRepository extends CrudRepository<Reservation, UUID> {
}
