package com.example.springwebapplication.SpringWebApp.service;

import com.example.springwebapplication.SpringWebApp.model.Product;
import com.example.springwebapplication.SpringWebApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

      @Autowired
      ProductRepository productRepository;

//    List<Product> allProducts = new ArrayList<>(Arrays.asList(
//            new Product(
//                    1,"Fan",2500.00
//            ),
//            new Product(
//                    2,"Laptop",35000.00
//    ),
//            new Product(
//                    3,"Monitor",6000.00
//
//    ),
//            new Product(
//                    4,"Mouse",3500.00)
//    ));


    public List<Product> getAllProducts(){
        return  productRepository.findAll();
    }

    public Product getProductById(int id){
        return productRepository.findById(id).orElse(new Product());
//        return allProducts.stream().filter(product -> product.getId() == id).findFirst().get();
    }

    public boolean addProduct(Product product){
         productRepository.save(product);
        return true;
       //return allProducts.add(product);
    }

    public boolean updateProduct(Product product){
        productRepository.save(product);
        return  true;

//        allProducts.removeIf(product1 -> product1.getId() == product.id);
//        return allProducts.add(product);

    }

    public boolean deleteProduct(int id){
        productRepository.deleteById(id);
        return true;
       // return allProducts.removeIf(p -> p.getId() == id);
    }

}
