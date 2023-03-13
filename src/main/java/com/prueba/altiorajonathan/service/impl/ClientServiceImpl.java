package com.prueba.altiorajonathan.service.impl;

import com.prueba.altiorajonathan.entity.Client;
import com.prueba.altiorajonathan.presenter.ClientPresenter;
import com.prueba.altiorajonathan.repository.ClientRepository;
import com.prueba.altiorajonathan.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void saveClient( ClientPresenter clientPresenter) {
        Client client = clientRepository.findByIdClient(clientPresenter.getIdClient()).orElse(new Client());
        client.setName(clientPresenter.getName());
        client.setLastName(clientPresenter.getLastName());
        clientRepository.save(client);
    }

    @Override
    public List<ClientPresenter> listClient() {
        List<Client> client = clientRepository.findAll();
        List<ClientPresenter> clientPresenters = new ArrayList<>();
        client.forEach(client1 -> {
            ClientPresenter clientPresenter = new ClientPresenter();
            clientPresenter.setIdClient(client1.getIdClient());
            clientPresenter.setName(client1.getName());
            clientPresenter.setLastName(client1.getLastName());
            clientPresenters.add(clientPresenter);
        });
        return clientPresenters;
    }

    @Override
    public void deleteClient(UUID clientId) {
        clientRepository.deleteByIdClient(clientId);
    }
}