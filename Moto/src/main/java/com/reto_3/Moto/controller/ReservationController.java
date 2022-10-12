package com.reto_3.Moto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.reto_3.Moto.model.Reservation;
import com.reto_3.Moto.service.ReservationService;

@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE })
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> obtenerReservationCompleta() {
        return reservationService.obtenerReservationCompleta();
    }

    @GetMapping("/{id}")
    public Optional<Reservation> obtenerReservationId(@PathVariable("id") Integer identificador) {
        return reservationService.obtenerReservationId(identificador);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation salvarReservation(@RequestBody Reservation reservation) {
        return reservationService.salvarReservation(reservation);
    }
}
