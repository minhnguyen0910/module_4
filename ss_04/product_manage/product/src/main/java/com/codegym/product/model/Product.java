package com.codegym.product.model;

public class Product {
    Integer id;
    String name;
    String evaluate;
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
