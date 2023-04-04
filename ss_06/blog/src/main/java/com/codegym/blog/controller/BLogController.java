package com.codegym.blog.controller;

import com.codegym.blog.model.BLog;
import com.codegym.blog.service.IBLogService;
import com.codegym.blog.service.ITypeBLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BLogController {
    @Autowired
    private IBLogService ibLogService;
    @Autowired
    private ITypeBLogService iTypeBLogService;

    @GetMapping("")
    public String showList(Model model, @RequestParam(name = "page", defaultValue = "0") Integer page) {
        Sort sort = Sort.by("date").descending();
        model.addAttribute("listBLog", ibLogService.findAll(PageRequest.of(page, 2, sort)));
        model.addAttribute("listType", iTypeBLogService.findAll());
        model.addAttribute("check", 0);
        return "list";
    }

    @GetMapping("create")
    public String showFormCreate(Model model) {
        model.addAttribute("list", new BLog());
        model.addAttribute("listType", iTypeBLogService.findAll());
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
        model.addAttribute("listType", iTypeBLogService.findAll());
        model.addAttribute("blog", ibLogService.findById(id));
        return "edit";
    }

    @PostMapping("edit")
    public String edit(BLog bLog) {
        ibLogService.edit(bLog);
        return "redirect:/blog";
    }

    @GetMapping("search")
    public String search(@RequestParam(name = "id", required = false) Integer id, Model model, @RequestParam(name = "page", defaultValue = "0") Integer page) {
        Sort sort = Sort.by("date").descending();
        Page<BLog> list = ibLogService.findByType(id, PageRequest.of(page, 2, sort));
        model.addAttribute("listBLog", list);
        model.addAttribute("listType", iTypeBLogService.findAll());
        model.addAttribute("check", 1);
        model.addAttribute("id", id);
        return "list";
    }
}
