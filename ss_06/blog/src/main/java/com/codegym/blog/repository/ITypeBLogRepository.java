package com.codegym.blog.repository;

import com.codegym.blog.model.TypeBLog;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ITypeBLogRepository extends PagingAndSortingRepository<TypeBLog,Integer> {
}
