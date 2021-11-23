package com.apps.Employeedetails;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		Employeedetails ed = new Employeedetails();
		ed.setId(11);
		ed.setSalary(300000);
		ed.setName("laya");
		ed.setSkillset("leadership");
		ed.setDateofjoin(LocalDate.of(2021, Month.NOVEMBER, 22));

		Employeedetails ed1 = new Employeedetails();
		ed1.setId(12);
		ed1.setSalary(400000);
		ed1.setName("akhila");
		ed1.setSkillset("creativity");
		ed1.setDateofjoin(LocalDate.of(2021, Month.JULY, 23));

		Employeedetails ed2 = new Employeedetails();
		ed2.setId(13);
		ed2.setSalary(20000);
		ed2.setName("kavya");
		ed2.setSkillset("decision making");
		ed2.setDateofjoin(LocalDate.of(2021, Month.AUGUST, 22));

		Employeedetails ed3 = new Employeedetails();
		ed3.setId(14);
		ed3.setSalary(30000);
		ed3.setName("maya");
		ed3.setSkillset("hardwork");
		ed3.setDateofjoin(LocalDate.of(2021, Month.MARCH, 22));

		Employeedetails ed4 = new Employeedetails();
		ed.setId(15);
		ed.setSalary(56000);
		ed.setName("kavitha");
		ed.setSkillset("leadership");
		ed.setDateofjoin(LocalDate.of(2021, Month.DECEMBER, 28));

		Employeedetails ed5 = new Employeedetails();
		ed5.setId(16);
		ed5.setSalary(450000);
		ed5.setName("lakshmi");
		ed5.setSkillset("communication");
		ed5.setDateofjoin(LocalDate.of(2021, Month.NOVEMBER, 22));

		Employeedetails ed6 = new Employeedetails();
		ed6.setId(17);
		ed6.setSalary(89000);
		ed6.setName("sahithi");
		ed6.setSkillset("adaptability");
		ed6.setDateofjoin(LocalDate.of(2021, Month.FEBRUARY, 22));

		Employeedetails ed7 = new Employeedetails();
		ed7.setId(18);
		ed7.setSalary(70000);
		ed7.setName("prasanna");
		ed7.setSkillset("leadership");
		ed7.setDateofjoin(LocalDate.of(2021, Month.AUGUST, 22));

		Employeedetails ed8 = new Employeedetails();
		ed8.setId(19);
		ed8.setSalary(70000);
		ed8.setName("ravi");
		ed8.setSkillset("analytical");
		ed8.setDateofjoin(LocalDate.of(2021, Month.MARCH, 22));

		Employeedetails ed9 = new Employeedetails();
		ed9.setId(20);
		ed9.setSalary(80000);
		ed9.setName("sharanya");
		ed9.setSkillset("hardwork");
		ed9.setDateofjoin(LocalDate.of(2021, Month.APRIL, 22));

		Employeedetails ed10 = new Employeedetails();
		ed10.setId(21);
		ed10.setSalary(70000);
		ed10.setName("prasad");
		ed10.setSkillset("leadership");
		ed10.setDateofjoin(LocalDate.of(2021, Month.FEBRUARY, 22));

		List<Employeedetails> employeedetailsList = new ArrayList<>();
		employeedetailsList.add(ed);
		employeedetailsList.add(ed1);
		employeedetailsList.add(ed2);
		employeedetailsList.add(ed3);
		employeedetailsList.add(ed4);
		employeedetailsList.add(ed5);
		employeedetailsList.add(ed6);
		employeedetailsList.add(ed7);
		employeedetailsList.add(ed8);
		employeedetailsList.add(ed9);
		employeedetailsList.add(ed10);

		for (Employeedetails empdet : employeedetailsList) {
			System.out.println(empdet);

		}
		System.out.println("=========================find employee by id");

		for (int i = 0; i < employeedetailsList.size(); i++) {
			if (20 == employeedetailsList.get(i).getId()) {
				System.out.println(employeedetailsList.get(i));

			}
     
		}
		System.out.println("======================find employee by name");
		for (Employeedetails emp : employeedetailsList) {
//			if("ravi"==emp.getName()) {
			if("ravi".equals(emp.getName())) {
				System.out.println(emp);
			}

		}

	}
}
