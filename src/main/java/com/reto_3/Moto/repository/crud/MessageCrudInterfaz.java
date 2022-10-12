package com.reto_3.Moto.repository.crud;

import org.springframework.data.repository.CrudRepository;

import com.reto_3.Moto.model.Message;

public interface MessageCrudInterfaz extends CrudRepository<Message, Integer>  {
    
}
