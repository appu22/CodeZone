package com.codezone.aptitude;

public class KWD {

	public static class Alphabets1 {

		public static void main(String a[]) {

			
			kAlphabet();
			System.out.println();
			wAlphabet();
			System.out.println();
			dAlphabet();

		}

		static int n = 7, mid = n / 2;

		// d
		public static void dAlphabet() {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == 0 && j != (n - 1) || j == 0 || i == (n - 1) && j != (n - 1)
							|| j == (n - 1) && i != 0 && i != (n - 1)) {
						System.out.print(" ** ");
					} else {
						System.out.print("   ");
					}

				}
				System.out.println();

			}
		}

		// k
		public static void kAlphabet() {
			// int n = 5, mid = n / 2;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (j == 0 || i + j == mid || i - j == mid) {
						System.out.print("** ");
					} else {
						System.out.print("   ");
					}

				}
				System.out.println();

			}
		}

		// w
		public static void wAlphabet() {
			// int n = 7, mid = n / 2;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (j == 0 || j == n - 1 || i == j && mid <= i || i + j == n - 1 && mid >= j) {
						System.out.print("** ");
					} else {
						System.out.print("   ");
					}

				}
				System.out.println();

			}
		}
	}
}
