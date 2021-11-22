package com.apps.Studentresult;

public class Studentresult {
	private int id;
	private String studentName;
	private int mathsmarks;
	private int physicsmarks;
	private int chemistrymarks;
	total=mathsmarks+physicsmarks+chemistrymarks;
	avg=total/3;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMathsmarks() {
		return mathsmarks;
	}

	public void setMathsmarks(int mathsmarks) {
		this.mathsmarks = mathsmarks;
	}

	public int getPhysicsmarks() {
		return physicsmarks;
	}

	public void setPhysicsmarks(int physicsmarks) {
		this.physicsmarks = physicsmarks;
	}

	public int getChemistrymarks() {
		return chemistrymarks;
	}

	public void setChemistrymarks(int chemistrymarks) {
		this.chemistrymarks = chemistrymarks;
	}

	@Override
	public String toString() {
		return "Studentresult [id=" + id + ", studentName=" + studentName + ", mathsmarks=" + mathsmarks
				+ ", physicsmarks=" + physicsmarks + ", chemistrymarks=" + chemistrymarks + "]";
	}



	
		
	}

