package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class StudentInformation {
	
	@Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
	
	@Column(nullable = false)
    private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "program_id")
	private Program program;
	
	@Column(length = 45)
	private String picture;
	
	
	@Column(nullable = false)
    private String fatherName;
	
	@Column(nullable = false)
    private String mothername;
	
	@Column(nullable = true)
    private String guardianName;
	
	@Column(nullable = false)
    private String studentContactNo;
	
	@Column(nullable = false)
    private String guardianContactNo;
	
	@Column(nullable = true)
    private String studentNid;
	
	
	@Column(nullable = true)
    private String email;
	
	@Column(nullable = false)
    private String presentAddress;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ssc_id")
	private Ssc ssc;
	
	@Column(nullable = false)
    private String sscRollNo;
	
	@Column(nullable = false)
    private String sscRegNo;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "passingYearSsc_id")
	private PassingYearSsc passingYearSsc;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sscBoard_id")
	private SscBoard sscBoard;
	
	@Column(nullable = false, name = "ssc_gpa")
	private Double sscGpa;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hsc_id")
	private Hsc hsc;
	
	@Column(nullable = false)
    private String hscRollNo;
	
	@Column(nullable = false)
    private String hscRegNo;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "passingYearHsc_id")
	private PassingYearHsc passingYearHsc;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hscBoard_id")
	private HscBoard hscBoard;
	
	
	@Column(nullable = false, name = "hsc_gpa")
	private Double hscGpa;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Program getProgram() {
		return program;
	}


	public void setProgram(Program program) {
		this.program = program;
	}


	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}


	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public String getMothername() {
		return mothername;
	}


	public void setMothername(String mothername) {
		this.mothername = mothername;
	}


	public String getGuardianName() {
		return guardianName;
	}


	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}


	public String getStudentContactNo() {
		return studentContactNo;
	}


	public void setStudentContactNo(String studentContactNo) {
		this.studentContactNo = studentContactNo;
	}


	public String getGuardianContactNo() {
		return guardianContactNo;
	}


	public void setGuardianContactNo(String guardianContactNo) {
		this.guardianContactNo = guardianContactNo;
	}


	public String getStudentNid() {
		return studentNid;
	}


	public void setStudentNid(String studentNid) {
		this.studentNid = studentNid;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPresentAddress() {
		return presentAddress;
	}


	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}


	public Ssc getSsc() {
		return ssc;
	}


	public void setSsc(Ssc ssc) {
		this.ssc = ssc;
	}


	public String getSscRegNo() {
		return sscRegNo;
	}


	public void setSscRegNo(String sscRegNo) {
		this.sscRegNo = sscRegNo;
	}


	public PassingYearSsc getPassingYearSsc() {
		return passingYearSsc;
	}


	public void setPassingYearSsc(PassingYearSsc passingYearSsc) {
		this.passingYearSsc = passingYearSsc;
	}


	public SscBoard getSscBoard() {
		return sscBoard;
	}


	public void setSscBoard(SscBoard sscBoard) {
		this.sscBoard = sscBoard;
	}


	public Double getSscGpa() {
		return sscGpa;
	}


	public void setSscGpa(Double sscGpa) {
		this.sscGpa = sscGpa;
	}


	public Hsc getHsc() {
		return hsc;
	}


	public void setHsc(Hsc hsc) {
		this.hsc = hsc;
	}


	public String getHscRegNo() {
		return hscRegNo;
	}


	public void setHscRegNo(String hscRegNo) {
		this.hscRegNo = hscRegNo;
	}


	public PassingYearHsc getPassingYearHsc() {
		return passingYearHsc;
	}


	public void setPassingYearHsc(PassingYearHsc passingYearHsc) {
		this.passingYearHsc = passingYearHsc;
	}


	public HscBoard getHscBoard() {
		return hscBoard;
	}


	public void setHscBoard(HscBoard hscBoard) {
		this.hscBoard = hscBoard;
	}


	public Double getHscGpa() {
		return hscGpa;
	}


	public void setHscGpa(Double hscGpa) {
		this.hscGpa = hscGpa;
	}


	public String getSscRollNo() {
		return sscRollNo;
	}


	public void setSscRollNo(String sscRollNo) {
		this.sscRollNo = sscRollNo;
	}


	public String getHscRollNo() {
		return hscRollNo;
	}


	public void setHscRollNo(String hscRollNo) {
		this.hscRollNo = hscRollNo;
	}
	
	

}
