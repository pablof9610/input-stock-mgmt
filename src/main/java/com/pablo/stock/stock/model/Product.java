package com.pablo.stock.stock.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer quantity;
    private String vendor;
}
