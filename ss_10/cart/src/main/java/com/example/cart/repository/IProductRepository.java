package com.example.cart.repository;

import com.example.cart.model.Product;
import com.example.cart.service.impl.ProductService;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product,Integer> {
}
