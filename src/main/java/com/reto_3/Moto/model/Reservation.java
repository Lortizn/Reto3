package com.reto_3.Moto.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "reservation")
@Getter
@Setter
public class Reservation  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Integer idReservation;
    private Date startDate;
    private Date devolutionDate;
    private String status = "created";

    @ManyToOne
    @JoinColumn(name = "motorbikeId")
    @JsonIgnoreProperties("reservations")
    private Motorbike motorbike;

    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties({ "reservations", "messages" })
    private Client client;

    @OneToOne(cascade = { CascadeType.REMOVE }, mappedBy = "reservation")
    @JsonIgnoreProperties("reservation")
    private Score score;


}
