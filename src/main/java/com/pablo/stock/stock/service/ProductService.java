package com.pablo.stock.stock.service;

import com.pablo.stock.stock.model.Product;
import com.pablo.stock.stock.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getAll() {
        return repository.findAll();
    }

    public Product findProductById(Long id) {
        Optional<Product> foundedProduct = repository.findById(id);
        if (foundedProduct.isEmpty()) {
            throw new NoSuchElementException("Resource not found with ID "+ id);
        }
        return foundedProduct.get();
    }

    public Product save(Product p) {
        return repository.save(p);
    }
}
