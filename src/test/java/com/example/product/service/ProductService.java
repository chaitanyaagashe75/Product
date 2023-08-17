package com.example.product.service;

import com.example.product.model.Product;

import java.util.List;

public interface ProductService {

    public Product addProduct(Product product);

    public List<Product> addAllProduct(List<Product> product);

   public Product getProduct(int id);

   public Product updateProduct(Product product,int id);
}
