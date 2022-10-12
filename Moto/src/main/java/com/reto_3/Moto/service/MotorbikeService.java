package com.reto_3.Moto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reto_3.Moto.model.Motorbike;
import com.reto_3.Moto.repository.MotorbikeRepository;

@Service
public class MotorbikeService {
    @Autowired
    public MotorbikeRepository motorbikeRepository;

    public List<Motorbike> obtenerMotorbikeCompleta(){
        return motorbikeRepository.obtenerMotorbikeCompleta();
    }

    public Optional<Motorbike> obtenerMotorbikeId(Integer id){
        return motorbikeRepository.obtenerMotorbikeId(id);
    }
public Motorbike salvarMotorbike(Motorbike motorbike){
        if(motorbike.getId()==null){
            return motorbikeRepository.salvarMotorbike(motorbike);
        }
        else{
            Optional <Motorbike> motorbikeAuxiliar = motorbikeRepository.obtenerMotorbikeId(motorbike.getId());
            if(motorbikeAuxiliar.isEmpty()){
                return motorbikeRepository.salvarMotorbike(motorbike);
            }
            else{
                return motorbike;
            }
        }

    }
    
}
