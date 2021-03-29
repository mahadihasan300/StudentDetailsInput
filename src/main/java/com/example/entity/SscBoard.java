package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class SscBoard {
	
	@Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    
    @Column(nullable = false)
    private String sscBoardName;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getSscBoardName() {
		return sscBoardName;
	}


	public void setSscBoardName(String sscBoardName) {
		this.sscBoardName = sscBoardName;
	}


    
    

}
