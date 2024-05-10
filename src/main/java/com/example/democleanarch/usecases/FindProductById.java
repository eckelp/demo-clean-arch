package com.example.democleanarch.usecases;

import com.example.democleanarch.domains.Product;
import com.example.democleanarch.domains.exceptions.ProductNotFoundException;
import com.example.democleanarch.gateways.ProductGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FindProductById {

    private final ProductGateway productGateway;

    public Product execute(final String id){
        return productGateway.findById(id).orElseThrow(ProductNotFoundException::new);
    }

}
