package com.example.springwebapplication.SpringWebApp.service;

import com.example.springwebapplication.SpringWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> allProducts = Arrays.asList(
            new Product(
                    1,"Fan",2500.00
            ),
            new Product(
                    2,"Laptop",35000.00
    ),
            new Product(
                    3,"Monitor",6000.00

    ),
            new Product(
                    4,"Mouse",3500.00)
    );


    public List<Product> getAllProducts(){
        return  allProducts;
    }

}
