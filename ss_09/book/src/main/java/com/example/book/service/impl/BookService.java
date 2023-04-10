package com.example.book.service.impl;

import com.example.book.model.Book;
import com.example.book.repository.IBookRepository;
import com.example.book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService implements IBookService {
    @Autowired
    IBookRepository iBookRepository;

    @Override
    public List<Book> findAll() {
        return (List<Book>) iBookRepository.findAll();
    }

    @Override
    public void update(Integer id) {
        Book book=findById(id);
        book.setQuantity(book.getQuantity()-1);
        iBookRepository.save(book);
    }

    @Override
    public Book findById(Integer id) {
        return iBookRepository.findById(id).get();
    }
}
