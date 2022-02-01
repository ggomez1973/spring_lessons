package com.endava.reservations.controllers;

import com.endava.reservations.domain.Client;
import com.endava.reservations.services.ClientsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/clients")
public class ClientsController {
    private final ClientsService clientsService;

    public ClientsController(ClientsService clientsService) {
        this.clientsService = clientsService;
    }

    @GetMapping
    public ResponseEntity<List<Client>> getAllClients(){
        return ResponseEntity.ok(clientsService.getAllClients());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable UUID id){
        return ResponseEntity.ok(clientsService.getClientById(id).get());
    }

    @PostMapping
    public ResponseEntity<Client> saveClient(@RequestBody Client client){
        return ResponseEntity.ok(clientsService.saveClient(client.getFirstName()));
    }
}
