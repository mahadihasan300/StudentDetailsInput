package com.example.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.PassingYearHsc;

@Repository
public interface PassingYearHscDao extends PagingAndSortingRepository<PassingYearHsc, String>{

}
