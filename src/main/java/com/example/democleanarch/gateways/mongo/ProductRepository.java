package com.example.democleanarch.gateways.mongo;

import com.example.democleanarch.gateways.mongo.documents.ProductDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductDocument, String> {
}
