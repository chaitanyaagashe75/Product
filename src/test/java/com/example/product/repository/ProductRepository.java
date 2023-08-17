package com.example.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository(Product,Integer){
}
