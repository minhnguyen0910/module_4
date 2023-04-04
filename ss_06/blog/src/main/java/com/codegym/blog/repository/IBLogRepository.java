package com.codegym.blog.repository;

import com.codegym.blog.model.BLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


public interface IBLogRepository extends PagingAndSortingRepository<BLog, Integer> {

    Page<BLog> findBLogsByTypeBLog_Id(Integer id, PageRequest pageRequest);

    @Query(value = "select * from blog where name_blog like :name ",nativeQuery = true)
    Page<BLog> findByName(@Param("name") String name, PageRequest pageRequest);
}
