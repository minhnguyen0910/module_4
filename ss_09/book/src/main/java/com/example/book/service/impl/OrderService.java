package com.example.book.service.impl;

import com.example.book.model.Order;
import com.example.book.repository.IOrderRepository;
import com.example.book.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {
    @Autowired
    IOrderRepository iOrderRepository;
    @Override
    public void save(Order order) {
        iOrderRepository.save(order);
    }
}
