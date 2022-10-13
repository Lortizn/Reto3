package com.reto_3.Moto.model;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "score")
@Getter
@Setter
public class Score implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idScore;
    private String messageText;
    private Integer stars;
    
    @OneToOne
    @JsonIgnoreProperties("score")
    private Reservation reservation;
}
