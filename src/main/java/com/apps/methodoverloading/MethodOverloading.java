package com.apps.methodoverloading;

public class MethodOverloading {
	public void add(int a, int b) {
		System.out.println(" add integers" + (a + b));
	
	}
	public void add(float a, float b) {
		System.out.println(" add float numbers " + (a + b));
	}

	public void add(double a, double b) {
		System.out.println(" add double numbers " + (a + b));
	}
	public void add(float a, int b) {
		System.out.println(" add floatint numbers " + (a + b));
	}
}
