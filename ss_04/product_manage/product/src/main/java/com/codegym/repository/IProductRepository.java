package com.codegym.repository;

import com.codegym.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void delete(Integer productID);

    void create(Product product);

    Product findByID(Integer id);

    List<Product> searchByName(String name);

    void edit(Product product);
}
