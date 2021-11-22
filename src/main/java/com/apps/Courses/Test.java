package com.apps.Courses;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Courses c1= new Courses();
		c1.setId(12);
		c1.setCoursename("java");
		c1.setFees(60000);
		c1.setDuration(50);
		c1.setActive(true);
		
		Courses c2= new Courses();
		c2.setId(13);
		c2.setCoursename("python");
		c2.setFees(50000);
		c2.setDuration(30);
		c2.setActive(false);
		
		Courses c3= new Courses();
		c3.setId(14);
		c3.setCoursename("c++");
		c3.setFees(13000);
		c3.setDuration(60);
		c3.setActive(true);
		
		Courses c4= new Courses();
		c4.setId(15);
		c4.setCoursename("sql");
		c4.setFees(25000);
		c4.setDuration(40);
		c4.setActive(false);
		
		Courses c5= new Courses();
		c5.setId(12);
		c5.setCoursename("automation testing");
		c5.setFees(79000);
		c5.setDuration(60);
		c5.setActive(true);
		
		Courses c6= new Courses();
		c6.setId(12);
		c6.setCoursename("manual testing");
		c6.setFees(5000);
		c6.setDuration(50);
		c6.setActive(false);
		
		Courses c7= new Courses();
		c7.setId(12);
		c7.setCoursename(".net");
		c7.setFees(4000);
		c7.setDuration(80);
		c7.setActive(true);
		
		Courses c8= new Courses();
		c8.setId(12);
		c8.setCoursename("css");
		c8.setFees(7000);
		c8.setDuration(60);
		c8.setActive(false);
		
		Courses c9= new Courses();
		c9.setId(12);
		c9.setCoursename("html");
		c9.setFees(68000);
		c9.setDuration(90);
		c9.setActive(true);
		
		Courses c10= new Courses();
		c10.setId(12);
		c10.setCoursename("bootstrap");
		c10.setFees(6000);
		c10.setDuration(60);
		c10.setActive(false);
		
		List<Courses> coursesList = new ArrayList<>();
		coursesList.add(c1);
		coursesList.add(c2);
		coursesList.add(c3);
		coursesList.add(c4);
		coursesList.add(c4);
		coursesList.add(c5);
		coursesList.add(c6);
		coursesList.add(c7);
		coursesList.add(c8);
		coursesList.add(c9);
		coursesList.add(c10);
		

		for (Courses ex : coursesList) {
			System.out.println(ex);
		}
		
		
	}

}
