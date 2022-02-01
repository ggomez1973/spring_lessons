package com.endava.reservations.persistance;

import com.endava.reservations.domain.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ClientsRepository extends CrudRepository<Client, UUID> {
}
