package com.example.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Hsc;
import com.example.entity.Program;

@Repository
public interface ProgramDao extends PagingAndSortingRepository<Program, String>{

}
