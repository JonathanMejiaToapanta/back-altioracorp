package com.prueba.altiorajonathan.controller;

import com.prueba.altiorajonathan.entity.Client;
import com.prueba.altiorajonathan.presenter.ClientPresenter;
import com.prueba.altiorajonathan.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/getClients")
    public List<ClientPresenter> clientPresenters() {
        return clientService.listClient();
    }

    @PostMapping("/insertClient")
    public void saveClient(@RequestBody ClientPresenter clientPresenter) {
        clientService.saveClient(clientPresenter);
    }

    @PostMapping("/deleteClient")
    @CrossOrigin
    @ResponseBody
    public void deleteClient(@RequestParam UUID idClient) {
        clientService.deleteClient(idClient);
    }

}
