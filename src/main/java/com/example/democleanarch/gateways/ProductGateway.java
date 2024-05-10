package com.example.democleanarch.gateways;

import com.example.democleanarch.domains.Product;

import java.util.Optional;

public interface ProductGateway {
    Product save(Product product);

    Optional<Product> findById(String id);
}
