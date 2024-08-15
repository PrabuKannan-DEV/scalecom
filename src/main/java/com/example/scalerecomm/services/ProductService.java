package com.example.scalerecomm.services;

import com.example.scalerecomm.models.Product;

public interface ProductService {
    Product createProduct(Product product);
    Product getProduct(Long id);
}
