package com.endava.reservations.controllers;

import com.endava.reservations.domain.Apartment;
import com.endava.reservations.domain.Reservation;
import com.endava.reservations.services.MainService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/apartments")
public class ApartmentsController {

    private final MainService mainService;

    public ApartmentsController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping
    public ResponseEntity<List<Apartment>> getAllApartments(){
        return ResponseEntity.ok(mainService.getAllApartments());
    }

    @PostMapping
    public ResponseEntity<Apartment> saveApartment(@RequestBody Apartment apartment){
        return ResponseEntity.ok(mainService.saveApartment(apartment.getDescription(),apartment.getPricePerDay()));
    }
}
