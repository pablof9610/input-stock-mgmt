package com.pablo.stock.stock.controller;

import com.pablo.stock.stock.service.ProductService;
import com.pablo.stock.stock.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getAllProduct() {
        return service.getAll();
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product p) {
        return service.save(p);
    }
}
