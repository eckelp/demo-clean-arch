package com.example.democleanarch.domains.exceptions;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(){
        super("Product not found exception");
    }

}
