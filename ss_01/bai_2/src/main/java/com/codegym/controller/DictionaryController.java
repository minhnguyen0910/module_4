package com.codegym.controller;
import com.codegym.service.DictionaryService;
import com.codegym.service.IDictionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("dictionary")
public class DictionaryController {
    IDictionaryService iDictionaryService = new DictionaryService();

    @GetMapping("")
    private String show() {
        return "index2";
    }

    @GetMapping("search")
    private String search(@RequestParam(name = "vietnamese") String string, Model model) {
        model.addAttribute("result", iDictionaryService.search(string));
        model.addAttribute("name", string);
        return "index2";
    }

}
