package com.s.entity;

import java.io.Serializable;

public class Employee implements Serializable {
	private Long id;
	private String name;
	private String email;
	private String address;
	private int age;
	private String gender;
	public Employee(Long id, String name, String email, String address, int age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.age = age;
		this.gender = gender;
	}
	public Employee() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", age=" + age
				+ ", gender=" + gender + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	

}
