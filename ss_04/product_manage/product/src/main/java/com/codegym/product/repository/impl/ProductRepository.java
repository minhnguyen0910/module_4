package com.codegym.product.repository.impl;

import com.codegym.product.model.Product;
import com.codegym.product.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    static List<Product> list = new ArrayList<>();

    static {
        list.add(new Product(1, "Acer", "Good", 20000.0));
        list.add(new Product(2, "Asus", "Good", 20000.0));
        list.add(new Product(3, "HP", "Good", 20000.0));
        list.add(new Product(4, "MacBook", "Good", 20000.0));
        list.add(new Product(5, "Dell", "Good", 20000.0));
    }

    @Override
    public List<Product> findAll() {
        return list;
    }

    public void deleteByID(Integer id) {
        for (Product product : list) {
            if (product.getId().equals(id)) {
                list.remove(product);
                break;
            }
        }
    }

    @Override
    public void create(Product product) {
        list.add(product);
    }

    @Override
    public Product findByID(Integer id) {
        for (Product product : list) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> list1 = new ArrayList<>();
        for (Product product : list) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                list1.add(product);
            }
        }
        return list1;
    }

    @Override
    public void edit(Product product) {
        for (Product product1 : list) {
            if (product1.getId().equals(product.getId())) {
                list.set(list.indexOf(product1), product);
                break;
            }
        }
    }
}
