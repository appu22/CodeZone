package com.codezone.cast;

public class Casting {
	public static void main(String[] args) {
		System.out.println("*********DataTypes Casting ************");
		charToInt();
		intToChar();
		intToDouble();
		intToString();
		intToByte();
		stringToDouble();
		System.out.println("************Program End***************");
	}

	public static void charToInt() {
		char c = 'A';
		int charToInt = (int) c;
		System.out.println("Char to Int ->" + charToInt);
//		int i = c;
//		System.out.println(i);

	}

	public static void intToChar() {
		int i = 97;
		char intToChar = (char) i;
		System.out.println("Int to Char -> " + intToChar);
	}

	public static void intToDouble() {
		int i = 97;
		double intTodouble = (double) i;
		System.out.println("Int to Char ->" + intTodouble);
	}

	public static void intToString() {
		int i = 97;
		String s = String.valueOf(i);
		System.out.println("int to String ->" + s);
	}

	public static void intToByte() {
		int i = 97;
		byte b = (byte) i;
		System.out.println("int to Byte ->" + b);
	}
	public static void stringToDouble() {
		String a = "45";
		//double d = Double.valueOf(a);
		//System.out.println(d);
		double f = Double.parseDouble(a);
		System.out.println(f);
	}

}
