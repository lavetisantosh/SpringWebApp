package com.example.springwebapplication.SpringWebApp.controller;

import com.example.springwebapplication.SpringWebApp.model.Product;
import com.example.springwebapplication.SpringWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.DeleteExchange;

import java.util.List;

@RestController
/// RestController is responsible to get the data from the server and send back data to the client
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts(){
      return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getProductById(id);

    }

    @PostMapping("/products")
    public boolean addProduct(@RequestBody Product product){
       return productService.addProduct(product);
    }

    @PutMapping("/products")
    public boolean updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public boolean deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }



}
