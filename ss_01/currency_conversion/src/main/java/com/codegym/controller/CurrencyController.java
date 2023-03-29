package com.codegym.controller;

import com.codegym.service.impl.CurrencyService;
import com.codegym.service.ICurrencyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("currency")
public class CurrencyController {
    private ICurrencyService iCurrencyService = new CurrencyService();

    @GetMapping("")
    private String show() {
        return "currency";
    }

    @GetMapping("convert")
    private String convert(@RequestParam(name = "usd") String uSD, Model model) {
        double uSDS = Double.parseDouble(uSD);
        double result = iCurrencyService.convertVND(uSDS);
        model.addAttribute("result", result);
        return "currency";
    }

}
