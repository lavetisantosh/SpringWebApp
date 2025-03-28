package com.example.springwebapplication.SpringWebApp.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;


@Component
@Entity
public class Product {

    @Id
    public int id;
    public String name;
    public double price;

    public Product(){

    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
