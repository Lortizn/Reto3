package com.reto_3.Moto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reto_3.Moto.model.Message;
import com.reto_3.Moto.repository.crud.MessageCrudInterfaz;

@Repository
public class MessageRepository {
    @Autowired
    private MessageCrudInterfaz messageCrudRepositoryInterfaz;

    public List<Message> obtenerMessageCompleta(){
        return (List<Message>) messageCrudRepositoryInterfaz.findAll();
    }

    public Optional<Message> obtenerMessageId(Integer id){
        return messageCrudRepositoryInterfaz.findById(id);
    }

    public Message salvarMessage(Message message){
        return messageCrudRepositoryInterfaz.save(message);     
    }
}
