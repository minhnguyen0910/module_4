package com.example.cart.service.impl;

import com.example.cart.model.Product;
import com.example.cart.repository.IProductRepository;
import com.example.cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepository iProductRepository;
    public List<Product> findAll(){
        return (List<Product>) iProductRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return iProductRepository.findById(id).get();
    }
}
