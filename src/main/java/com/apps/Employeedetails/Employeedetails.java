package com.apps.Employeedetails;

import java.time.LocalDate;

public class Employeedetails {
	int id;
	String name;
	double salary;
	String skillset;
	LocalDate dateofjoin;

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSkillset() {
		return skillset;
	}

	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}

	public LocalDate getDateofjoin() {
		return dateofjoin;
	}

	public void setDateofjoin(LocalDate dateofjoin) {
		this.dateofjoin = dateofjoin;
	}

	@Override
	public String toString() {
		return "Employeedetails [id=" + id + ", name=" + name + ", salary=" + salary + ", skillset=" + skillset
				+ ", dateofjoin=" + dateofjoin + "]";
	}

}
