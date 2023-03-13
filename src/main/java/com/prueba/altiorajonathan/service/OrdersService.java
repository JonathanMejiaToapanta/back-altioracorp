package com.prueba.altiorajonathan.service;

import com.prueba.altiorajonathan.presenter.ClientPresenter;
import com.prueba.altiorajonathan.presenter.OrderByClient;
import com.prueba.altiorajonathan.presenter.OrdersPresenter;

import java.util.List;
import java.util.UUID;

public interface OrdersService {

    void saveOrder(OrdersPresenter ordersPresenter);
    List<OrderByClient> listOrder(UUID idClient);

}
