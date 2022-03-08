package com.endava.security.controllers;

import com.endava.security.domain.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1.0/clients")
public class ClientController {
    @GetMapping("/count")
    public ResponseEntity<String> getCount(){
        return ResponseEntity.ok("El total de usuarios es 10500");
    }
// hasRole('ROLE_') hasAnyRole hasAuthority hasAnyAuthority
    @GetMapping("/{id}")
    @PreAuthorize("hasRole('ROLE_MANAGER')")
    public ResponseEntity<String> getClientById(@PathVariable String id){
        return ResponseEntity.ok("Cacho en detalle");
    }

    @GetMapping
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_MANAGER')")
    public ResponseEntity<String> getClients(){

        return ResponseEntity.ok("Cacho, Roberto, Pedro");
    }

}
