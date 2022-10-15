package com.reto_3.Moto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.reto_3.Moto.model.Reservation;
import com.reto_3.Moto.repository.ReservationRepository;

@Service
public class ReservationService {
    public ReservationRepository reservationRepository;

    public List<Reservation> obtenerReservationCompleta() {
        return reservationRepository.obtenerReservationCompleta();

    }
    public Optional<Reservation> obtenerReservationId(Integer id) {
        return reservationRepository.obtenerReservationId(id);
    }
    public Reservation salvarReservation(Reservation reservation) {
        if (reservation.getIdReservation() == null) {
            return reservationRepository.salvarReservation(reservation);
        } else {
            Optional<Reservation> reservationAuxiliar = reservationRepository
                    .obtenerReservationId(reservation.getIdReservation());
if (reservationAuxiliar.isEmpty()) {
                return reservationRepository.salvarReservation(reservation);
            } else {
                return reservation;
            }
        }

    }




    
}
