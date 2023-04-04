package com.codegym.blog.controller;

import com.codegym.blog.model.BLog;
import com.codegym.blog.service.IBLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/blog")
public class BLogController {
    @Autowired
    private IBLogService ibLogService;

    @GetMapping("")
    public String showList(Model model,@RequestParam(name = "page",defaultValue = "0") Integer page) {
        model.addAttribute("listBLog", ibLogService.findAll(PageRequest.of(page,1)));
        return "list";
    }

    @GetMapping("create")
    public String showFormCreate(Model model) {
        model.addAttribute("list", new BLog());
        return "create";
    }

    @PostMapping("create")
    public String create(BLog bLog) {
        ibLogService.save(bLog);
        return "redirect:/blog";
    }

    @PostMapping("delete")
    public String delete(@RequestParam(name = "id") Integer id) {
        ibLogService.delete(id);
        return "redirect:/blog";
    }

    @GetMapping("edit/{id}")
    public String showFormEdit(@PathVariable(name = "id") Integer id, Model model) {
        model.addAttribute("blog", ibLogService.findById(id));
        return "edit";
    }

    @PostMapping("edit")
    public String edit(BLog bLog) {
        ibLogService.edit(bLog);
        return "redirect:/blog";
    }
}
