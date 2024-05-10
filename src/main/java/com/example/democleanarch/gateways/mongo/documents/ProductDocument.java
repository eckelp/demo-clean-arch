package com.example.democleanarch.gateways.mongo.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collation = "products")
public record ProductDocument(
        @Id String id,
        String name,
        BigDecimal price
) {
}
