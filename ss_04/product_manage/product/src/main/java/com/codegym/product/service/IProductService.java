package com.codegym.product.service;

import com.codegym.product.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void deleteByID(Integer id);

    void create(Product product);

    Product findByID(Integer id);

    Product searchByID(Integer id);

    List<Product> searchByName(String name);

    void edit(Product product);
}
