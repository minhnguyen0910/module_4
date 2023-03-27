package com.codegym.controller;

import com.codegym.repository.DictionaryRepository;
import com.codegym.repository.IDictionaryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("dictionary")
public class DictionaryController {
    IDictionaryRepository dictionaryRepository = new DictionaryRepository();

    @GetMapping("")
    private String show() {
        return "index2";
    }

    @GetMapping("search")
    private String search(@RequestParam(name = "tiengViet") String string, Model model) {
        model.addAttribute("result", dictionaryRepository.search(string));
        model.addAttribute("name", string);
        return "index2";
    }

}
