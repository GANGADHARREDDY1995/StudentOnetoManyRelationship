package com.benz.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="student_registration")
public class Student {
	private int admissionNumber;
	private String name;
	private String father;
	private StudentAddress address;
	private String mother;
	private Date dateOfBirth;
	private int admissionClass;
	private String source;
	private long mobileNumber;
	public Student(){
		
	}
	
	
	public Student(String name, String father, StudentAddress address,
			String mother, Date dateOfBirth, int admissionClass, String source,
			long mobileNumber) {
		super();
		this.name = name;
		this.father = father;
		this.address = address;
		this.mother = mother;
		this.dateOfBirth = dateOfBirth;
		this.admissionClass = admissionClass;
		this.source = source;
		this.mobileNumber = mobileNumber;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ADMISSIONNUMBER" ,unique=true,nullable=false )
	public int getAdmissionNumber() {
		return admissionNumber;
	}
	public void setAdmissionNumber(int admissionNumber) {
		this.admissionNumber = admissionNumber;
	}
	@Column(name="STUDENTNAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="FATHERNAME")
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	@OneToOne(targetEntity=StudentAddress.class,cascade=CascadeType.ALL)
	@JoinColumn(name="ADMISSIONNUMBER",referencedColumnName="ADMISSIONNUMBER")
	public StudentAddress getAddress() {
		return address;
	}
	public void setAddress(StudentAddress address) {
		this.address = address;
	}
	@Column(name="MOTHERNAME")
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	@Column(name="DATEOFBIRTH")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Column(name="ADMISSIONCLASS")
	public int getAdmissionClass() {
		return admissionClass;
	}
	public void setAdmissionClass(int admissionClass) {
		this.admissionClass = admissionClass;
	}
	@Column(name="SOURCE")
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	@Column(name="MOBILENUMBER")
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
