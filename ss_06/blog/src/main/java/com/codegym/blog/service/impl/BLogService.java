package com.codegym.blog.service.impl;

import com.codegym.blog.model.BLog;
import com.codegym.blog.repository.IBLogRepository;
import com.codegym.blog.service.IBLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BLogService implements IBLogService {
    @Autowired
    private IBLogRepository ibLogRepository;

    @Override
    public List<BLog> findAll() {
        return (List<BLog>) ibLogRepository.findAll();
    }

    @Override
    public void save(BLog bLog) {
        ibLogRepository.save(bLog);
    }

    @Override
    public void delete(Integer id) {
        ibLogRepository.deleteById(id);
    }

    @Override
    public BLog findById(Integer id) {
        return ibLogRepository.findById(id).get();
    }

    @Override
    public void edit(BLog bLog) {
        ibLogRepository.save(bLog);
    }
}