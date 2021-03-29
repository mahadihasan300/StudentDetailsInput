package com.example.dao;

import javax.annotation.Resource;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.entity.Ssc;

@Resource
public interface SscDao extends PagingAndSortingRepository<Ssc, String>{

}
