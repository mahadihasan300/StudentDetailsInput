package com.example.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.PassingYearSsc;

@Repository
public interface PassingYearSscDao extends PagingAndSortingRepository<PassingYearSsc, String>{

}
