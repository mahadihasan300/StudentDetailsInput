package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Hsc {
	
	@Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    
    @Column(nullable = false)
    private String hscType;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getHscType() {
		return hscType;
	}


	public void setHscType(String hscType) {
		this.hscType = hscType;
	}
    
    

}
