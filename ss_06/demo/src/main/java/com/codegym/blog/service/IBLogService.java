package com.codegym.blog.service;

import com.codegym.blog.model.BLog;

import java.util.List;

public interface IBLogService {
    List<BLog> findAll();

    void save(BLog bLog);

    void delete(Integer id);

    BLog findById(Integer id);

    void edit(BLog bLog);
}
