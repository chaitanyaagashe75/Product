package com.example.product.service.ProductServiceImpl;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;
import com.example.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;


    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> addAllProduct(List<Product> products) {
        return productRepository.saveAll(products);
    }

    @Override
    public Product getProduct(int id) {
      Optional<Product> OptionalProduct = productRepository.findById(id);
      if(OptionalProduct.isPresent()){
           Product product1=OptionalProduct.get();
           return product1;
      }else {
          return null;
      }
    }


    @Override
    public Product updateProduct(Product product,int id) {
        Optional<Product> OptProduct = productRepository.findById(id);
        if(OptProduct.isPresent()){
            Product product1=OptProduct.get();
            product1.setName(product.getName());
            product1.setDetails(product.getDetails());
            product1.setPrice(product.getPrice());
            return productRepository.save(product1);
        }else{
            log.info("Product not available");
            return null;
        }
    }
}

