package com.prueba.altiorajonathan.service.impl;

import com.prueba.altiorajonathan.entity.Orders;
import com.prueba.altiorajonathan.entity.Product;
import com.prueba.altiorajonathan.presenter.OrderByClient;
import com.prueba.altiorajonathan.presenter.OrdersPresenter;
import com.prueba.altiorajonathan.repository.OrdersRepository;
import com.prueba.altiorajonathan.repository.ProductRepository;
import com.prueba.altiorajonathan.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void saveOrder(OrdersPresenter ordersPresenter) {
        Orders order = ordersRepository.findByIdOrder(ordersPresenter.getIdOrder()).orElse(new Orders());
        order.setDateCreated(ordersPresenter.getDateCreated());
        order.setIdClient(ordersPresenter.getIdClient());
        order.setIdProduct(ordersPresenter.getIdProduct());
        order.setCant(ordersPresenter.getCant());
        Product product = productRepository.findById(ordersPresenter.getIdProduct()).orElse(new Product());
        product.setStock(product.getStock().subtract(ordersPresenter.getCant()));
        productRepository.save(product);
        ordersRepository.save(order);
    }

    @Override
    public List<OrderByClient> listOrder(UUID idClient) {
        List<Object[]> getOrders = ordersRepository.getOrderClient(idClient);
        List<OrderByClient> order = new ArrayList<>();
        getOrders.forEach(objects -> {
            OrderByClient order1 = new OrderByClient();
            order1.setDateCreated((Date) objects[0]);
            order1.setCode((String) objects[1]);
            order1.setName((String) objects[2]);
            order1.setPriceUnit((BigDecimal) objects[3]);
            order1.setCant((BigDecimal) objects[4]);
            order.add(order1);
        });
        return order;
    }

}
