package com.codegym.blog.repository;

import com.codegym.blog.model.BLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface IBLogRepository extends PagingAndSortingRepository<BLog, Integer> {
}
