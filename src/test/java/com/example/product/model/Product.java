package com.example.product.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    int id ;
    String name ;
    String details;
    int price;



}
