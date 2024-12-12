package com.pablo.stock.stock.repository;

import com.pablo.stock.stock.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
