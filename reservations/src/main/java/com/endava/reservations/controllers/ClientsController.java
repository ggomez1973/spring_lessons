package com.endava.reservations.controllers;

import com.endava.reservations.domain.Client;
import com.endava.reservations.services.ClientNotFoundException;
import com.endava.reservations.services.MainService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1.0/clients")
public class ClientsController {
    private final MainService mainService;

    public ClientsController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping
    @Operation(summary = "Gets all the clients, duh!")
    public ResponseEntity<List<Client>> getAllClients(){
        return ResponseEntity.ok(mainService.getAllClients());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable UUID id){
        try {
            Client client = mainService.getClientById(id);
            return ResponseEntity.ok(client);
        } catch (ClientNotFoundException e){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Client> saveClient(@RequestBody Client client){
        return ResponseEntity.ok(mainService.saveClient(client.getFirstName()));
    }
}
