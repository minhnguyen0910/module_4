package com.example.book.repository;

import com.example.book.model.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBookRepository extends PagingAndSortingRepository<Book,Integer> {
}
