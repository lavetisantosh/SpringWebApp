package com.example.springwebapplication.SpringWebApp.repository;


import com.example.springwebapplication.SpringWebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
