package com.example.springwebapplication.SpringWebApp.controller;

import com.example.springwebapplication.SpringWebApp.model.Product;
import com.example.springwebapplication.SpringWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
/// RestController is responsible to get the data from the server and send back data to the client
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public List<Product> getProducts(){
      return productService.getAllProducts();
    }

}
