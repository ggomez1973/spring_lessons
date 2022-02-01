package com.endava.reservations.services;

import com.endava.reservations.domain.Client;
import com.endava.reservations.persistance.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DefaultClientsServiceImpl implements ClientsService {
    // @Autowired   // NOOO!!! Field Injection
    private ClientsRepository repository;

    @Autowired
    public void setRepository(ClientsRepository repository) {
        this.repository = repository;
    }

    @Override
    public Client getClientById(UUID id) {
        return repository.findById(id).orElseThrow(ClientNotFoundException::new);
    }

    @Override
    public List<Client> getAllClients() {
        return (List<Client>) repository.findAll();
    }

    @Override
    public Client saveClient(String name) {
        Client client = new Client(name);
        return repository.save(client);
    }
}
