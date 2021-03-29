package com.example.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Hsc;

@Repository
public interface HscDao extends PagingAndSortingRepository<Hsc, String>{

}
