package com.apps;

public class ArrayTest {

	public static void main(String[] args) {
		int[] a= {3, 4, 7, 1, 8, 9};
		
     System.out.println("before sorting");
     
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n========================");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
//				System.out.println(a[i]+" "+a[j]);
				if(a[i]>a[j]) {
					int temp = a[i]; // temp=3;
					a[i] = a[j];// a[i]=4
					a[j] = temp; //
				}
			
			}
		}
	
		
		System.out.println("\nAfter sorting");
		

		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
