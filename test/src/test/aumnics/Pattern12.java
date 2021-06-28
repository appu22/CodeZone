package test.aumnics;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {

		/*
		 * 1 2 1 3 2 1 4 3 2 1 5 4 3 2 1 6 5 4 3 2 1
		 */

		Scanner sc = new Scanner(System.in);

		// Taking rows value from the user

		System.out.println("How many rows you want in this pattern?");

		int rows = sc.nextInt();

		System.out.println("Here is your pattern....!!!");

		for (int i = 1; i <= rows; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
//
			System.out.println();
		}
		for (int i = rows; rows >= 1; i--) {
			for (int j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		System.out.println();

		// Close the resources

		sc.close();
	}
}
