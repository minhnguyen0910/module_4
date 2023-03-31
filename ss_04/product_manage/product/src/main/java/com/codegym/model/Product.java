package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "id")
    Integer id;
    @Column(name = "name_product")
    String name;
    @Column(name = "evaluate")
    String evaluate;
    @Column(name = "price")
    Double price;

    public Product() {
    }

    public Product(Integer id, String name, String detail, Double price) {
        this.id = id;
        this.name = name;
        this.evaluate = detail;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
