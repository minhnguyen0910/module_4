package com.example.book.service;

import com.example.book.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface IBookService{
    List<Book> findAll();

    void update(Integer id);
    Book findById(Integer id);
}
