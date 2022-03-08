package com.endava.security.controllers;

import com.endava.security.domain.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1.0/manager/clients")
public class ClientManagerController {

    @PostMapping
    @PreAuthorize("hasAuthority('client:write')")
    public ResponseEntity<String> createClient(@RequestBody Client client){
        return ResponseEntity.ok("Creando cliente");
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('client:write')")
    public ResponseEntity<String> createClient(@PathVariable String id, @RequestBody Client client){
        return ResponseEntity.ok("Modificando cliente");
    }
}
