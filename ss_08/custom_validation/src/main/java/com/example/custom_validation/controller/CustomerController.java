package com.example.custom_validation.controller;

import com.example.custom_validation.dto.CustomerCreateDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class CustomerController {
    @GetMapping("create")
    public String showForm(Model model) {
        model.addAttribute("customer", new CustomerCreateDTO());
        return "create";
    }

    @PostMapping("create")
    public String create(@Valid @ModelAttribute("customer") CustomerCreateDTO customer,
                         BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "create";
        } else {
            return "create";
        }
    }
}
