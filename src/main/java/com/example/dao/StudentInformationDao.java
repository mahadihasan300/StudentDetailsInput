package com.example.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.StudentInformation;

@Repository
public interface StudentInformationDao extends PagingAndSortingRepository<StudentInformation, String>{

}
