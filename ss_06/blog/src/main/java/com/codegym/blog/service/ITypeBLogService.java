package com.codegym.blog.service;

import com.codegym.blog.model.BLog;
import com.codegym.blog.model.TypeBLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ITypeBLogService {
    List<TypeBLog> findAll();
}
