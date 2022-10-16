package com.reto_3.Moto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reto_3.Moto.model.Reservation;
import com.reto_3.Moto.model.Score;
import com.reto_3.Moto.repository.crud.ReservationCrudRepositoryInterfaz;

@Repository
public class ReservationRepository {
    @Autowired
    private ReservationCrudRepositoryInterfaz reservationCrudRepositoryInterfaz;

    public List<Reservation> obtenerReservationCompleta() {
        return (List<Reservation>) reservationCrudRepositoryInterfaz.findAll();
    }

    public Optional<Reservation> obtenerReservationId(Integer id) {
        return reservationCrudRepositoryInterfaz.findById(id);
    }

    public Reservation salvarReservation(Reservation reservation) {
        return reservationCrudRepositoryInterfaz.save(reservation);
    }
    public void BorrarScore(Score score){
        scoreCrudRepository.BorrarScore(score);
    }

}
