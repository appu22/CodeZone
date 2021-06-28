package test.aumnics;

public class Test4 {

	public static void main(String[] args) {
		int input = 123;
//		int input = 151;
		int res = solve(input);
		System.out.println(res);
	}

	private static int solve(int n) {
		int temp = n;
		int sum = 0;
		int res = 0;
		while (n > 0) {
			int r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		int temp2 = temp;
		if (temp == sum) {
			while (temp2 > 0) {
				int r = temp2 % 10;
				res += r;
				temp2 /= 10;
			}
			System.out.println(temp);
			System.out.println(" is palindrome  " + res);
		} else {
			res = 1;
			while (temp2 > 0) {
				int r = temp2 % 10;
				res *= r;
				temp2 /= 10;

			}
			System.out.println("not palindrome  " + res);

		}

		return res;

	}
}
