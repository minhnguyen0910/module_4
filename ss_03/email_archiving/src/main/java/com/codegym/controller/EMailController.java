package com.codegym.controller;

import com.codegym.model.Setting;
import com.codegym.service.IEmailService;
import com.codegym.service.imp.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("email")
public class EMailController {
    IEmailService iEmailService = new EmailService();

    @GetMapping("")
    public String showForm(Model model) {
        model.addAttribute("setting", new Setting());
        model.addAttribute("language", iEmailService.selectLanguage());
        model.addAttribute("size", iEmailService.selectSize());
        return "index";
    }

    @PostMapping("form")
    public String setting(@ModelAttribute Setting setting, Model model) {
        model.addAttribute("settings", setting);
        model.addAttribute("language", iEmailService.selectLanguage());
        model.addAttribute("size", iEmailService.selectSize());
        return "index";
    }
}
