package com.apps.Studentresult;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Studentresult s1= new Studentresult();
		s1.setId(10);
		s1.setStudentName("laya");
		s1.setMathsmarks(50);
		s1.setChemistrymarks(60);
		s1.setPhysicsmarks(70);
		int t1 =s1.getMathsmarks()+s1.getPhysicsmarks()+s1.getChemistrymarks();
		s1.setTotal(t1);
		s1.setAvg(t1/3);
		
		
		Studentresult s2= new Studentresult();
		s2.setId(11);
		s2.setStudentName("kavya");
		s2.setMathsmarks(60);
		s2.setChemistrymarks(70);
		s2.setPhysicsmarks(80);
		int t2 =s2.getMathsmarks()+s2.getPhysicsmarks()+s2.getChemistrymarks();
		s2.setTotal(t2);
		s2.setAvg(t2/3);
		
		Studentresult s3= new Studentresult();
		s3.setId(12);
		s3.setStudentName("sandhya");
		s3.setMathsmarks(90);
		s3.setChemistrymarks(50);
		s3.setPhysicsmarks(70);
		int t3 =s3.getMathsmarks()+s3.getPhysicsmarks()+s3.getChemistrymarks();
		s3.setTotal(t3);
		s3.setAvg(t3/3);
		
		Studentresult s4= new Studentresult();
		s4.setId(13);
		s4.setStudentName("ramya");
		s4.setMathsmarks(80);
		s4.setChemistrymarks(60);
		s4.setPhysicsmarks(60);
		int t4 =s4.getMathsmarks()+s4.getPhysicsmarks()+s4.getChemistrymarks();
		s4.setTotal(t4);
		s4.setAvg(t4/3);
		
		Studentresult s5= new Studentresult();
		s5.setId(14);
		s5.setStudentName("kanya");
		s5.setMathsmarks(50);
		s5.setChemistrymarks(60);
		s5.setPhysicsmarks(70);
		int t5 =s5.getMathsmarks()+s5.getPhysicsmarks()+s5.getChemistrymarks();
		s5.setTotal(t5);
		s5.setAvg(t5/3);
		
		Studentresult s6= new Studentresult();
		s6.setId(15);
		s6.setStudentName("tanya");
		s6.setMathsmarks(60);
		s6.setChemistrymarks(50);
		s6.setPhysicsmarks(80);
		int t6 =s6.getMathsmarks()+s6.getPhysicsmarks()+s6.getChemistrymarks();
		s6.setTotal(t6);
		s6.setAvg(t6/3);
		
		Studentresult s7= new Studentresult();
		s7.setId(16);
		s7.setStudentName("ananya");
		s7.setMathsmarks(90);
		s7.setChemistrymarks(50);
		s7.setPhysicsmarks(70);
		int t7 =s7.getMathsmarks()+s7.getPhysicsmarks()+s7.getChemistrymarks();
		s7.setTotal(t7);
		s7.setAvg(t7/3);
		
		Studentresult s8= new Studentresult();
		s8.setId(17);
		s8.setStudentName("aadhya");
		s8.setMathsmarks(50);
		s8.setChemistrymarks(60);
		s8.setPhysicsmarks(70);
		int t8 =s8.getMathsmarks()+s8.getPhysicsmarks()+s8.getChemistrymarks();
		s8.setTotal(t8);
		s8.setAvg(t8/3);
		
		Studentresult s9= new Studentresult();
		s9.setId(18);
		s9.setStudentName("priya");
		s9.setMathsmarks(90);
		s9.setChemistrymarks(60);
		s9.setPhysicsmarks(40);
		int t9 =s9.getMathsmarks()+s9.getPhysicsmarks()+s9.getChemistrymarks();
		s9.setTotal(t9);
		s9.setAvg(t9/3);
		
		Studentresult s10= new Studentresult();
		s10.setId(19);
		s10.setStudentName("aaradhya");
		s10.setMathsmarks(70);
		s10.setChemistrymarks(78);
		s10.setPhysicsmarks(80);
		int t10 =s10.getMathsmarks()+s10.getPhysicsmarks()+s10.getChemistrymarks();
		s10.setTotal(t10);
		s10.setAvg(t10/3);
		

		List<Studentresult> studentresultList = new ArrayList<>();
		studentresultList.add(s1);
		studentresultList.add(s2);
		studentresultList.add(s3);
		studentresultList.add(s4);
		studentresultList.add(s5);
		studentresultList.add(s6);
		studentresultList.add(s7);
		studentresultList.add(s8);
		studentresultList.add(s9);
		studentresultList.add(s10);
		
		
		for(Studentresult sr:studentresultList) {
			System.out.println(sr);
		}

		
		
		
		
		
	}

}
