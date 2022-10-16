package com.reto_3.Moto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reto_3.Moto.model.Client;
import com.reto_3.Moto.repository.ClientRepository;



@Service
public class ClientService {
    @Autowired
    public ClientRepository clientRepository;

    public List<Client> obtenerClientCompleta(){
        return clientRepository.obtenerClientCompleta();
    }

    public Optional<Client> obtenerClientId(Integer id){
        return clientRepository.obtenerClientId(id);
    }
public Client salvarClient(Client client){
        if(client.getIdClient()==null){
            return clientRepository.salvarClient(client);
        }
        else{
            Optional <Client> clientAuxiliar = clientRepository.obtenerClientId(client.getIdClient());
            if(clientAuxiliar.isEmpty()){
                return clientRepository.salvarClient(client);
            }
            else{
                return client;
            }
        }

    }
    public Boolean BorrarClient (int id){
        boolean d = getClient(id).map(client-> {
            clientRepository.BorrarClient(client);
            return true;

        }).orElse(false);
        return d;
    }
    
}
