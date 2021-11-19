package com.apps.methodchaining;

public class MethodChaining {
	public void m1(int a) {
		System.out.println("m1 method " + a);
		m2(a);

	}

	public void m2(int a) {
		int c = a * 2;
		System.out.println("m2 method " + (c));
		m3(c);

	}

	public void m3(int a) {
		System.out.println("m3 method " + (a * 4));

	}

}
