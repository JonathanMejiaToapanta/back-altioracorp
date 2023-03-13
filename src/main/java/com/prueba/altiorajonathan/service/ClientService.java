package com.prueba.altiorajonathan.service;

import com.prueba.altiorajonathan.presenter.ClientPresenter;

import java.util.List;
import java.util.UUID;

public interface ClientService {

    void saveClient(ClientPresenter clientPresenter);
    List<ClientPresenter> listClient();
    void deleteClient(UUID idClient);
}
