package com.prueba.altiorajonathan.service.impl;

import com.prueba.altiorajonathan.entity.Product;
import com.prueba.altiorajonathan.presenter.ProductPresenter;
import com.prueba.altiorajonathan.repository.ProductRepository;
import com.prueba.altiorajonathan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void saveProduct(ProductPresenter presenter) {
        Product product = productRepository.findById(presenter.getId()).orElse(new Product());
        product.setCode(presenter.getCode());
        product.setName(presenter.getName());
        product.setPriceUnit(presenter.getPriceUnit());
        product.setStock(presenter.getStock());
        productRepository.save(product);
    }

    @Override
    public List<ProductPresenter> listProduct() {
        List<Product> products = productRepository.findAll();
        List<ProductPresenter> productPresenters = new ArrayList<>();
        products.forEach(product -> {
            ProductPresenter presenter = new ProductPresenter();
            presenter.setId(product.getId());
            presenter.setCode(product.getCode());
            presenter.setName(product.getName());
            presenter.setPriceUnit(product.getPriceUnit());
            presenter.setStock(product.getStock());
            productPresenters.add(presenter);
        });
        return productPresenters;
    }

    @Override
    public List<ProductPresenter> findProduct(UUID id, BigDecimal can) {
        List<Object[]> products = productRepository.findByIds(id, can);
        List<ProductPresenter> productPresenters = new ArrayList<>();
        if (!products.isEmpty()) {
            products.forEach(product1 -> {
                ProductPresenter presenter = new ProductPresenter();
                presenter.setId(UUID.fromString(String.valueOf(product1[0])));
                presenter.setCode((String) product1[1]);
                presenter.setName((String) product1[2]);
                presenter.setPriceUnit((BigDecimal) product1[3]);
                presenter.setStock((BigDecimal) product1[4]);
                productPresenters.add(presenter);
            });
        }
        return productPresenters;
    }
}
