package com.codegym.product.repository;

import com.codegym.product.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void deleteByID(Integer id);

    void create(Product product);

    Product findByID(Integer id);

    List<Product> searchByName(String name);

    void edit(Product product);
}
