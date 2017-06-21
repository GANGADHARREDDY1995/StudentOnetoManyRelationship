package com.benz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_ADDRESS")
public class StudentAddress {
	private int addmissionNumber;
	private String doorNumber;
	private String street;
	private String area;
	private String mandal;
	private String district;
	private int pinCode;

	public StudentAddress() {

	}

	public StudentAddress(String doorNumber, String street, String area,
			String mandal, String district, int pinCode) {
		super();
		this.doorNumber = doorNumber;
		this.street = street;
		this.area = area;
		this.mandal = mandal;
		this.district = district;
		this.pinCode = pinCode;
	}
	@Id
	@Column(name="ADMISSION_NUMBER")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getAddmissionNumber() {
		return addmissionNumber;
	}

	public void setAddmissionNumber(int addmissionNumber) {
		this.addmissionNumber = addmissionNumber;
	}
	@Column(name="DOOR_NUMBER")
	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}
	@Column(name="STREET")
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	@Column(name="AREA")
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	@Column(name="MANDAL")
	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	@Column(name="DISTRICT")
	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	@Column(name="PINCODE")
	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

}
