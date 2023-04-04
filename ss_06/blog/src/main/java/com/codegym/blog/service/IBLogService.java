package com.codegym.blog.service;

import com.codegym.blog.model.BLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IBLogService {
    Page<BLog> findAll(PageRequest pageRequest);

    void save(BLog bLog);

    void delete(Integer id);

    BLog findById(Integer id);

    void edit(BLog bLog);
}
