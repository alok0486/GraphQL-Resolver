package com.accionlabs.graphql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Address {
	public Address() {}
	public Address(Integer addres_id, String house_no, String city, String pin) {
		super();
		this.addres_id = addres_id;
		this.house_no = house_no;
		this.city = city;
		this.pin = pin;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ADDRESS_ID")
	private Integer addres_id;
	@Column(name = "HOUSE_NO")
	private	String house_no;
	@Column(name = "CITY")
	private	String city;
	@Column(name = "PIN")
	private	String pin;
	public Integer getAddres_id() {
		return addres_id;
	}
	public void setAddres_id(Integer addres_id) {
		this.addres_id = addres_id;
	}
	public String getHouse_no() {
		return house_no;
	}
	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
}
