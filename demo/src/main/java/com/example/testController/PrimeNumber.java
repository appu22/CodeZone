package com.example.testController;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int n =10;
		
		
		//even or odd
		/*
		 * for(int i = 2; i<n; i++) {
		 * 
		 * if(i % 2 == 0) { System.out.println("****EvenNumber => "+i); }else {
		 * System.out.println("****OddNumber => "+i); } }
		 */
		
		boolean isPrime = true;
		//prime 
		for(int i = 2; i<n-1; i++) {
			
			if(i % 2 == 0) {
				isPrime = false;
				System.out.println(i);
			}
		}
	}

}
