package com.codezone.application.age;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Agecollection {

	public static void main(String[] args) {

		Collection<String> ageboys = new ArrayList<String>();
		ageboys.hashCode();
		String tirthaAge = "25";
		ageboys.add(tirthaAge);
		String appuAge = "24";
		ageboys.add(appuAge);
		String santuAge = "23";
		ageboys.add(santuAge);
		String darshanAge = "22";
		ageboys.add(darshanAge);

//		Iterator<String> iterator = ageboys.iterator();
//		while (iterator.hasNext())	
//		{
//			System.out.println(iterator.next());
//		}
		Collection<String> girls = (Collection)ageboys ;
		
		String rashmikaAge = "30";
		girls.add(rashmikaAge);
		String rachita = "27"; 
		girls.add(rachita);
		
		Iterator<String> iterator = girls.iterator();
		while (iterator.hasNext())	
		{
			System.out.println(iterator.next());
			
		}
		
	}
}
