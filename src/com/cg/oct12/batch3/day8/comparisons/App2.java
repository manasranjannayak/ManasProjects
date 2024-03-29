package com.cg.oct12.batch3.day8.comparisons;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App2 {

	public static void main(String[] args) {

		List<Employee2> empList = new ArrayList<>();
		empList.add(new Employee2(101, "Sonu", 10.6));
		empList.add(new Employee2(102, "Monu", 20.6));
		empList.add(new Employee2(103, "Tonu", 40.6));
		empList.add(new Employee2(104, "Ponu", 30.6));

		System.out.println("Before sort");

		for (Employee2 e : empList) {
			System.out.println(e.toString());
		}

		Collections.sort(empList);

		System.out.println("After sort");

		for (Employee2 e : empList) {
			System.out.println(e.toString());
		}

	}

}