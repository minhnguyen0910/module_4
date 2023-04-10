package com.example.cart.controller;

import com.example.cart.model.Product;
import com.example.cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("cart")
@RequestMapping("product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @ModelAttribute("cart")
    List<Product> list() {
        return new ArrayList<>();
    }

    @GetMapping("")
    public String list(Model model) {
        model.addAttribute("listProduct", iProductService.findAll());
        return "list";
    }

    @GetMapping("cart")
    public String listFavorite(@ModelAttribute("cart") List<Product> list, Model model, @RequestParam("id") Integer id) {
        Product product = iProductService.findById(id);
        list.add(product);
        model.addAttribute("cart", list);
        return "cart";
    }
}
