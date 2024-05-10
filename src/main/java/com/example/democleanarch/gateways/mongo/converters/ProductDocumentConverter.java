package com.example.democleanarch.gateways.mongo.converters;

import com.example.democleanarch.domains.Product;
import com.example.democleanarch.gateways.mongo.documents.ProductDocument;
import org.springframework.stereotype.Component;

@Component
public class ProductDocumentConverter {

    public ProductDocument convert(final Product product) {
        return new ProductDocument(
                product.id(),
                product.name(),
                product.price()
        );
    }

    public Product convert(final ProductDocument document) {
        return new Product(
          document.id(),
          document.name(),
          document.price()
        );
    }

}
