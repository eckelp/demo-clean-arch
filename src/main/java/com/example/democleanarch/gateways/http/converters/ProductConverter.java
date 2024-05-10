package com.example.democleanarch.gateways.http.converters;

import com.example.democleanarch.domains.Product;
import com.example.democleanarch.gateways.http.json.CreateProductJson;
import com.example.democleanarch.gateways.http.json.ProductResponseJson;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {

    public Product convert(final CreateProductJson json) {
        return new Product(
                null, json.name(), json.price()
        );
    }

    public ProductResponseJson convert(Product product) {
        return new ProductResponseJson(
                product.id(),
                product.name(),
                product.price()
        );
    }
}
