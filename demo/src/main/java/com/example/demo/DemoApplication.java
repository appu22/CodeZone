package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
		//System.out.println("---------- "+ch.toString()); 
		String s=new String(ch);
		//System.out.println("---------- "+s);
		String temp = "appu";
		int i;
//		for(i = temp.length(); temp.length() <= 0; i--) {
//			System.out.println("-- "+i);
//		}
		for(i = 0; i<temp.length(); i++) {
			//System.out.println("i index "+i+" - " +temp.charAt(i));
		}
		
		//in built function
		String reversed = new StringBuilder(temp).reverse().toString();
		//System.out.println(reversed);
		
		for(i = temp.length()-1; i>=0; i--) {
			System.out.println("temp "+temp.charAt(i)); 
		}
		
	}

}
