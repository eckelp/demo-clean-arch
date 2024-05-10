package com.example.democleanarch.gateways.mongo;

import com.example.democleanarch.domains.Product;
import com.example.democleanarch.gateways.ProductGateway;
import com.example.democleanarch.gateways.mongo.converters.ProductDocumentConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ProductGatewayImpl implements ProductGateway {

    private final ProductDocumentConverter productDocumentConverter;
    private final ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        final var document = productDocumentConverter.convert(product);

        return productDocumentConverter.convert(productRepository.save(document));
    }

    @Override
    public Optional<Product> findById(String id) {
        return productRepository.findById(id)
                .map(productDocumentConverter::convert);
    }
}
