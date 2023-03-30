package com.codegym.product.service.impl;

import com.codegym.product.model.Product;
import com.codegym.product.repository.IProductRepository;
import com.codegym.product.repository.impl.ProductRepository;
import com.codegym.product.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    IProductRepository iProductRepository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public void deleteByID(Integer id) {
        iProductRepository.deleteByID(id);
    }

    @Override
    public void create(Product product) {
        iProductRepository.create(product);
    }

    @Override
    public Product findByID(Integer id) {
        return iProductRepository.findByID(id);
    }

    @Override
    public Product searchByID(Integer id) {
        return iProductRepository.findByID(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        return iProductRepository.searchByName(name);
    }

    @Override
    public void edit(Product product) {
        iProductRepository.edit(product);
    }
}
