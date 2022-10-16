package com.reto_3.Moto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reto_3.Moto.model.Client;
import com.reto_3.Moto.repository.crud.ClientCrudRepositoryInterfaz;

@Repository
public class ClientRepository {
    @Autowired
    private ClientCrudRepositoryInterfaz clientCrudRepositoryInterfaz;

    public List<Client> obtenerClientCompleta(){
        return (List<Client>) clientCrudRepositoryInterfaz.findAll();
    }

    public Optional<Client> obtenerClientId(Integer id){
        return clientCrudRepositoryInterfaz.findById(id);
    }

    public Client salvarClient(Client client){
        return clientCrudRepositoryInterfaz.save(client);     
    }
    public void BorrarClient(Client client){
        clientCrudRepository.BorrarClient(client);
    }

}
