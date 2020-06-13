package com.retailbanking.beans;

public class Customer {
	private int SSNID;     	
	private String name;
	private int age;
	private String address;
	private String state;
	private String city;
	public int getSSNID() {
		return SSNID;
	}
	public void setSSNID(int sSNID) {
		SSNID = sSNID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
