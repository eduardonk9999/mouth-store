package com.mouth.mouth.service;

import com.mouth.mouth.controller.Product;
import com.mouth.mouth.repository.ProductRepository;

import java.util.List;

public class ProductService {
    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Rroduct> listProduct() {
        return productRepository.findAll();
    }

    public Ṕroduct registerProduct(Product product) {
        S save = productRepository.save(product);
        return save;
    }
}
