package com.endava.reservations.controllers;

import com.endava.reservations.controllers.vos.ReservationValueObject;
import com.endava.reservations.domain.Apartment;
import com.endava.reservations.domain.Client;
import com.endava.reservations.domain.Reservation;
import com.endava.reservations.services.MainService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/reservations")
public class ReservationsController {
    private final MainService mainService;

    public ReservationsController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping
    public ResponseEntity<List<Reservation>> getAllReservations(){
        return ResponseEntity.ok(mainService.getAllReservations());
    }

    @PostMapping
    public ResponseEntity<Reservation> saveReservation(@RequestBody ReservationValueObject reservation){
        return ResponseEntity.ok(mainService.makeReservation(reservation));
    }
}
