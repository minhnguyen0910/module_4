package com.example.book.repository;

import com.example.book.model.Order;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

public interface IOrderRepository extends PagingAndSortingRepository<Order,Integer> {
}
