package com.bezkoder.springjwt.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity( name = "customer")
public class Customer {
	@Id
	public int id;
 public String name, city;
 public int mobileno;
 
 public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Customer(String username,String city,int mobileno)
 {
	 this.name = username;
	 this.city = city;
	 this.mobileno = mobileno;
 }
 
 public String getName() {
	return name;
 }
 public void setName(String username) {
	this.name = username;
 }
 public String getCity() {
	return city;
 }
 public void setCity(String city) {
	this.city = city;
 }
 public int getMobileno() {
	return mobileno;
 }
 public void setMobileno(int mobileno) {
	this.mobileno = mobileno;
 }
}
