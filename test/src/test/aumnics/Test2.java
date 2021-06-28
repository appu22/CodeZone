package test.aumnics;

public class Test2 {

	public static void main(String[] args) {

		int[] input = { 15, 17, 10, 25, 32, 16 };
		int result = max(input);
		System.out.println(result);

	}

	private static int max(int[] input) {
		int max = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}

}
