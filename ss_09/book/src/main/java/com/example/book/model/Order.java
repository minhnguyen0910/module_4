package com.example.book.model;

import javax.persistence.*;

@Entity
@Table(name = "order_book")
public class Order {
    @Id
    @Column(name = "id_order")
    Double id;
    @ManyToOne
    @JoinColumn(name = "id_cus")
    Customer customer;
    @ManyToOne
    @JoinColumn(name = "id_book")
    Book book;

    public Order(Double id, Customer customer, Book book) {
        this.id = id;
        this.customer = customer;
        this.book = book;
    }

    public Order() {
    }

    public Order(Double random, Integer i, Integer id) {
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
