package com.example.testController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class Test extends TestC {

	public static void main(String[] args) {

//		TestC t = new TestC();
//		
//		Test test = new Test();
//		test.m1();
//	}
//
//	public void m1() {
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//
//		for (int i = 0; i < 10; i++) {
//			list.add(i);
//		}
//		System.out.println("Number of list " + list);
//		System.out.println("Number of list " + list.size());

		HashMap<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "abcd");
		capitalCities.put("USA", "Washington DC");
		
		//System.out.println(capitalCities);
		System.out.println(capitalCities.get("USA"));
		
	}
}
