package com.apps.address;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Address a1=new Address();
		a1.setId(101);
		a1.setCity("hyd");
		a1.setState("telangana");
		a1.setPincode(500070);
		a1.setLocallanguage("telugu");
		
		Address a2=new Address();
		a2.setId(102);
		a2.setCity("vij");
		a2.setState("Ap");
		a2.setPincode(500071);
		a2.setLocallanguage("telugu");
		
		Address a3=new Address();
		a3.setId(103);
		a3.setCity("hyd");
		a3.setState("telangana");
		a3.setPincode(500072);
		a3.setLocallanguage("telugu");
		
		Address a4=new Address();
		a4.setId(104);
		a4.setCity("hyd");
		a4.setState("telangana");
		a4.setPincode(500073);
		a4.setLocallanguage("telugu");
		
		Address a5=new Address();
		a5.setId(105);
		a5.setCity("hyd");
		a5.setState("telangana");
		a5.setPincode(500074);
		a5.setLocallanguage("telugu");
		
		
		Address a6=new Address();
		a6.setId(106);
		a6.setCity("hyd");
		a6.setState("telangana");
		a6.setPincode(500075);
		a6.setLocallanguage("telugu");
		
		Address a7=new Address();
		a7.setId(107);
		a7.setCity("hyd");
		a7.setState("telangana");
		a7.setPincode(500076);
		a7.setLocallanguage("telugu");
		
		Address a8=new Address();
		a8.setId(108);
		a8.setCity("hyd");
		a8.setState("telangana");
		a8.setPincode(500077);
		a8.setLocallanguage("telugu");
		
		Address a9=new Address();
		a9.setId(109);
		a9.setCity("hyd");
		a9.setState("telangana");
		a9.setPincode(500078);
		a9.setLocallanguage("telugu");
		
		Address a10=new Address();
		a10.setId(110);
		a10.setCity("hyd");
		a10.setState("telangana");
		a10.setPincode(500079);
		a10.setLocallanguage("telugu");
		
		List<Address> AddressList = new ArrayList<>();
		AddressList.add(a1);
		AddressList.add(a2);
		AddressList.add(a3);
		AddressList.add(a4);
		AddressList.add(a5);
		AddressList.add(a6);
		AddressList.add(a7);
		AddressList.add(a8);
		AddressList.add(a9);
		AddressList.add(a10);

		for (Address a :AddressList) {
			System.out.println(a);
		
		
		
		
	}

}

}
