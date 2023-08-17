package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/post")
    private Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @PostMapping("/postAll")
    private List<Product> addAllProduct(@RequestBody List<Product> product){
        return productService.addAllProduct(product);
    }

    @RequestMapping("/get/{id}")
    private Product getProduct(@PathVariable int id){
        return productService.getProduct(id);
    }

    @RequestMapping("/update/{id}")
     private Product updateProduct(Product product, int id){
        return productService.updateProduct(product,id);
    }


}
