package com.example.democleanarch.usecases;

import com.example.democleanarch.domains.Product;
import com.example.democleanarch.gateways.ProductGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateProduct {

    private final ProductGateway productGateway;

    public Product execute(final Product product) {
        //apply business

        return productGateway.save(product);
    }

}
