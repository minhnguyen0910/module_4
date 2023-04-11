package com.codegym.blog.controller;

import com.codegym.blog.model.BLog;
import com.codegym.blog.model.TypeBLog;
import com.codegym.blog.service.IBLogService;
import com.codegym.blog.service.ITypeBLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/blog")
public class BLogRestController {
    @Autowired
    private IBLogService ibLogService;

    @GetMapping("")
    public ResponseEntity<Page<BLog>> showList(@RequestParam(name = "page", defaultValue = "0") Integer page) {
        Sort sort = Sort.by("date").descending();
        return new ResponseEntity<>(ibLogService.findAll(PageRequest.of(page, 2, sort)), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<?> create(BLog bLog) {
        ibLogService.save(bLog);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("")
    public ResponseEntity<BLog> delete(@RequestParam(name = "id") Integer id) {
        ibLogService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping("edit")
    public ResponseEntity<BLog> edit(BLog bLog) {
        ibLogService.edit(bLog);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("search")
    public ResponseEntity<BLog> search(@RequestParam(name = "id", required = false) Integer id, @RequestParam(name = "page", defaultValue = "0") Integer page) {
        Sort sort = Sort.by("date").descending();
        return new ResponseEntity<>(ibLogService.findById(id), HttpStatus.OK);
    }
}
