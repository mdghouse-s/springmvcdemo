package com.learn.app.service;

import java.util.List;

import com.learn.app.model.Product;

public interface ProductService {
    Product addProduct(Product product);

    Product getProductById(Long id);

    List<Product> getAllProducts();
}

