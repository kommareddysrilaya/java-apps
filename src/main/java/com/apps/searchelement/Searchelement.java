package com.apps.searchelement;

public class Searchelement {
	public static void main(String[] args) {

		int[] a = { 8, 7, 2, 5, 3, 1 };
		int b = 3;
		boolean flag = false;
//		System.out.println(a[0]);
		/*
		for (int x : a) {

			if (b == x) {
				flag = true;

			}

		}*/
		
		for(int i=0;i<a.length;i++) {
			if (b == a[i]) {
				flag = true;

			}
		}
		
			
		if (flag == true) {
			System.out.println("element is found");

		} else {

			System.out.println("not found");
		}

	}

}
