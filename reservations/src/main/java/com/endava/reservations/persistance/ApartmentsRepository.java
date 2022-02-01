package com.endava.reservations.persistance;

import com.endava.reservations.domain.Apartment;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ApartmentsRepository extends CrudRepository<Apartment, UUID> {
}
