package com.codegym.controller;

import com.codegym.service.impl.CalculatorService;
import com.codegym.service.ICalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
@RequestMapping("calculator")
public class CalculatorController {
    ICalculatorService calculatorService = new CalculatorService();

    @GetMapping("")
    public String show() {
        return "index";
    }

    @PostMapping("")
    public String calculates(@RequestParam("fistNumber") double fist,
                             @RequestParam("secondNumber") double second,
                             @RequestParam("calculation") String calculation,
                             Model model) {
        if (second == 0 & Objects.equals(calculation, "/")) {
            model.addAttribute("mess", "khong duoc chia cho 0");
            model.addAttribute("first", fist);
            model.addAttribute("second", second);
            return "index";
        } else {
            double result = calculatorService.calculator(fist, second, calculation);
            model.addAttribute("result", result);
            model.addAttribute("first", fist);
            model.addAttribute("second", second);
            return "index";
        }
    }
}
