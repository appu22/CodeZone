package com.codezone.app;

public class ConvertingPrimitiveTypesToString {

	public static void main(String[] args) {

		int i = 10;
		System.out.println("There are three way to convert integer to string ");
		String convertingIntToString = Integer.toString(i);
		System.out.println("Converting Integer to String : " + i);

		int a = 20;
		String convertingIntToString1 = String.valueOf(a);
		System.out.println("Converting Integer to String : " + a);

		int b = 30;
		String convertingIntToString2 = String.format("%d", b);
		System.out.println("Converting Integer to String : " + b);

		System.out.println("****************************************************");
		String age = "34";
		int stringToInt = Integer.parseInt("34");// pass string value

		System.out.println("Converting String To Int [Integer.parseInt()] : " + Integer.parseInt(age));

		int add = stringToInt + 5;
//		System.out.println(stringToInt+5);
		System.out.println("Addition String to int : " + add);

		Integer convertingStringToInt = Integer.valueOf(age);
		System.out.println("Converting String To Int [ Integer.valueOf()] : " + convertingStringToInt);
		System.out.println("****************************************************");

		System.out.println("Long.parseLong : " + Long.parseLong(age));
		System.out.println("Float.parseFloat : " + Float.parseFloat(age));
		System.out.println("Double.parseDouble : " + Double.parseDouble(age));
		System.out.println("****************************************************");

		charToInt();
	}

	public static void charToInt() {
		
		char a='A';
		System.out.println(Character.getNumericValue(a));
		char b = 'B';
		System.out.println(Character.getNumericValue(b));
		char c='C';
		System.out.println(Character.getNumericValue(c));
//		 int charValue = Character.getNumericValue(c);
		char d='d';
		System.out.println(Character.getNumericValue(d));
		char e='e';
		System.out.println(Character.getNumericValue(e));
		char f='f';
		System.out.println(Character.getNumericValue(f));
		char g='g';
		System.out.println(Character.getNumericValue(g));
		char h='h';
		System.out.println(Character.getNumericValue(h));
		char i='i';
		System.out.println(Character.getNumericValue(i));
		char j='j';
		System.out.println(Character.getNumericValue(j));
		char k='k';
		System.out.println(Character.getNumericValue(k));
		char l='l';
		System.out.println(Character.getNumericValue(l));
		char m='m';
		System.out.println(Character.getNumericValue(m));
		char n='n';
		System.out.println(Character.getNumericValue(n));
		char o='o';
		System.out.println(Character.getNumericValue(o));
		char p='p';
		System.out.println(Character.getNumericValue(p));
		char q='q';
		System.out.println(Character.getNumericValue(q));
		char r='r';
		System.out.println(Character.getNumericValue(r));
		char s='s';
		System.out.println(Character.getNumericValue(s));
		char t='t';
		System.out.println(Character.getNumericValue(t));
		char u='u';
		System.out.println(Character.getNumericValue(u));
		char v='v';
		System.out.println(Character.getNumericValue(v));
		char w='w';
		System.out.println(Character.getNumericValue(w));
		char x='x';
		System.out.println(Character.getNumericValue(x));
		char y='y';
		System.out.println(Character.getNumericValue(y));
		char z='z';
		System.out.println(Character.getNumericValue(z));

	}
}
