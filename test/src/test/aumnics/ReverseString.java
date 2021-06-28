package test.aumnics;

import java.util.Scanner;

public class ReverseString {
	static String s3 = "hi appu";
	String s;
	public static void main(String[] args) {
		String s5 = " ";
		char[] charAt = s3.toCharArray();
		for (int i = charAt.length - 1; i >= 0; i--) {
			s5 = s5 + charAt[i];

		}
		System.out.print(s5);
		reverseString();

	}

	public static void reverseString() {
		System.out.println("\n Reverse Word using loop");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String ");
		String s = sc.nextLine();
		for(int i=s.length(); i>0 ; --i) {
			System.out.print(s.charAt(i-1));
		}
		

	}

}
