package com.example.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.HscBoard;

@Repository
public interface HscBoardDao extends PagingAndSortingRepository<HscBoard, String>{

}
