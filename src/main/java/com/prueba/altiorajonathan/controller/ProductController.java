package com.prueba.altiorajonathan.controller;

import com.prueba.altiorajonathan.presenter.ClientPresenter;
import com.prueba.altiorajonathan.presenter.ProductPresenter;
import com.prueba.altiorajonathan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getProducts")
    public List<ProductPresenter> productPresenters() {
        return productService.listProduct();
    }

    @PostMapping("/insertProduct")
    public void saveProduct(@RequestBody ProductPresenter productPresenter){
        productService.saveProduct(productPresenter);
    }

    @GetMapping("/findProduct")
    public List<ProductPresenter> productPresenters(@RequestParam("id") UUID id) {
        return productService.findProduct(id);
    }

}
