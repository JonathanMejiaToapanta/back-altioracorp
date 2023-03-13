package com.prueba.altiorajonathan.service;

import com.prueba.altiorajonathan.entity.Product;
import com.prueba.altiorajonathan.presenter.ProductPresenter;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    void saveProduct(ProductPresenter presenter);
    List<ProductPresenter> listProduct();
    List<ProductPresenter> findProduct(UUID id);
}
