package com.codegym.blog.service.impl;

import com.codegym.blog.model.BLog;
import com.codegym.blog.model.TypeBLog;
import com.codegym.blog.repository.ITypeBLogRepository;
import com.codegym.blog.service.ITypeBLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeBLogService implements ITypeBLogService {
    @Autowired
    ITypeBLogRepository iTypeBLogRepository;

    public List<TypeBLog> findAll() {
        return (List<TypeBLog>) iTypeBLogRepository.findAll();
    }
}
