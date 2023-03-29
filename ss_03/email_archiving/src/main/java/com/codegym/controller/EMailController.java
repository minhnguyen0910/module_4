package com.codegym.controller;

import com.codegym.model.Setting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("email")
public class EMailController {
    String[] languages = new String[]{"English", "Vietnamese", "Japans", "Chinese"};
    Integer[] size = new Integer[]{5, 10, 15, 25, 50, 100};

    @GetMapping("")
    public String showForm(Model model) {
        model.addAttribute("setting", new Setting());
        model.addAttribute("language", languages);
        model.addAttribute("size", size);
        return "index";
    }

    @PostMapping("form")
    public String setting(@ModelAttribute Setting setting, Model model) {
        model.addAttribute("settings", setting);
        model.addAttribute("language", languages);
        model.addAttribute("size", size);
        return "index";
    }
}
