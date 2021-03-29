package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class PassingYearHsc {
	
	@Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    
    @Column(nullable = false)
    private String hscPassingYear;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getHscPassingYear() {
		return hscPassingYear;
	}


	public void setHscPassingYear(String hscPassingYear) {
		this.hscPassingYear = hscPassingYear;
	}
    
    

}
