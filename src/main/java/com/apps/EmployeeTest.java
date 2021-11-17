package com.apps;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
	public static void main(String[] args) {

		Employee e1 = new Employee(11, "laya", "hyd", "11-06-2021");
		Employee e2 = new Employee(12, "akhila", "vij", "12-06-2021");
		Employee e3 = new Employee(13, "madhav", "vijag", "11-06-2021");
		Employee e4 = new Employee(14, "sahithi", "warangal", "11-06-2021");

		/*
		 * System.out.println(e1); System.out.println(e2); System.out.println(e3);
		 * System.out.println(e4);
		 */

		List<Employee> emps = new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);

//	for(int i=0;i<4;i++) {
//		System.out.println(emps.get(i));
//	}

		for (int i = 0; i < emps.size(); i++) {
			System.out.println(emps.get(i));
		}

		for (Employee emp : emps) {
			System.out.println(emp);

		}
	}
}
