package com.apps;

public class Employee {

	
	private int id;
	private String name;
	private String location;
	private String dateOfJoin;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	public Employee(int id, String name, String location, String dateOfJoin) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.dateOfJoin = dateOfJoin;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", location=" + location + ", dateOfJoin=" + dateOfJoin + "]";
	}

}
