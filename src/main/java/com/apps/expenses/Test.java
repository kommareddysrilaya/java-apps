package com.apps.expenses;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Expenses e1 = new Expenses();
		e1.setId(11);
		e1.setItem("electricity bill");
		e1.setUnitPrice(2.4);
		e1.setDate(LocalDate.of(2021, Month.NOVEMBER, 10));
		e1.setQuantity(100);
		e1.setActive(false);
		e1.setTotalPrice(e1.getUnitPrice() * e1.getQuantity());

		Expenses e2 = new Expenses();

		e2.setId(11);
		e2.setItem("water bill");
		e2.setUnitPrice(3.5);
//		e2.setDate(LocalDate.of(2021, Month.AUGUST, 21));
		e2.setDate(LocalDate.now());
		e2.setQuantity(50);
		e2.setActive(true);
		e2.setTotalPrice(e2.getUnitPrice() * e2.getQuantity());

//
//		System.out.println(e1);
//		System.out.println(e2);

		List<Expenses> expensesList = new ArrayList<>();
		expensesList.add(e1);
		expensesList.add(e2);

		for (Expenses ex : expensesList) {
			System.out.println(ex);
		}

//         expensesList.stream().forEach(System.out::println);

	}

}
