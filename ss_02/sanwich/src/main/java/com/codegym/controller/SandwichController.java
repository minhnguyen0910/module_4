package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("sandwich")
public class SandwichController {
    @GetMapping("")
    public String show() {
        return "index";
    }

    @GetMapping("save")
    public String save(@RequestParam("condiment") List<String> condiment, Model model) {
        model.addAttribute("condiment", condiment);
        return "index";
    }
}
