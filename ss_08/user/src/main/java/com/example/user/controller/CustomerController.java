package com.example.user.controller;

import com.example.user.dto.CustomerCreateDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CustomerController {
    @GetMapping("create")
    public String showForm(Model model) {
        model.addAttribute("customer", new CustomerCreateDTO());
        return "create";
    }

    @PostMapping("create")
    public String create(@Valid @ModelAttribute("customer") CustomerCreateDTO customerCreateDTO,
                         BindingResult bindingResult, Model model) {
        new CustomerCreateDTO().validate(customerCreateDTO, bindingResult);
        if (bindingResult.hasErrors()) {
            return "create";
        } else {
            return "create";
        }
    }
}
