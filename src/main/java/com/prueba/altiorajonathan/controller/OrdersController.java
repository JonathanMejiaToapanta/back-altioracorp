package com.prueba.altiorajonathan.controller;

import com.prueba.altiorajonathan.presenter.OrderByClient;
import com.prueba.altiorajonathan.presenter.OrdersPresenter;
import com.prueba.altiorajonathan.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @PostMapping("/saveOrdersN")
    public void saveOrders(@RequestBody OrdersPresenter ordersPresenter){
        ordersService.saveOrder(ordersPresenter);
    }

    @GetMapping("/getOrderByClient")
    public List<OrderByClient> getOrder(@RequestParam("idClient") UUID idClient){
        return ordersService.listOrder(idClient);
    }
}
