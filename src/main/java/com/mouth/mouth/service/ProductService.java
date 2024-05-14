package com.mouth.mouth.service;

import com.mouth.mouth.repository.ProductRepository;

public class ProductService {
    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
