package com.endava.reservations.services;

import com.endava.reservations.domain.Client;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface ClientsService {
    Client getClientById(UUID id);
    List<Client> getAllClients();
    Client saveClient(String name);
}
