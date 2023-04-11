package com.example.book.controller;

import com.example.book.model.Order;
import com.example.book.service.IBookService;
import com.example.book.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("book")
public class BookController {
    @Autowired
    IBookService iBookService;
    @Autowired
    IOrderService iOrderService;

    @GetMapping("list")
    public String showList(Model model) {
        model.addAttribute("list", iBookService.findAll());
        return "list";
    }

    @GetMapping("borrow")
    public String borrow(@RequestParam(name = "id") Integer id) {
        iBookService.update(id);
        return "redirect:/book/list";
    }

}
