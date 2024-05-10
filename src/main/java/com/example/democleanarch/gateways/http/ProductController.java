package com.example.democleanarch.gateways.http;

import com.example.democleanarch.gateways.http.converters.ProductConverter;
import com.example.democleanarch.gateways.http.json.CreateProductJson;
import com.example.democleanarch.gateways.http.json.ProductResponseJson;
import com.example.democleanarch.usecases.CreateProduct;
import com.example.democleanarch.usecases.FindProductById;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductConverter converter;
    private final CreateProduct createProduct;
    private final FindProductById findProductById;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponseJson create(@RequestBody CreateProductJson json) {
        final var product = converter.convert(json);

        return converter.convert(createProduct.execute(product));
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ProductResponseJson findById(@PathVariable String id){
        final var product = findProductById.execute(id);

        return converter.convert(product);
    }

}
