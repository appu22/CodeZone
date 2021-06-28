package test.aumnics;

public class Test3 {
	public static void main(String[] args) {

		String input = "welcome to programming round one";
		String res = solve(input + " ");
		System.out.println(res);
	}

	private static String solve(String input) {
		// TODO Auto-generated method stub
		String res = "";
		char[] temp = input.toCharArray();
		for (int i = 0; i < temp.length; i++) {
			int count = 0;
			int flag = 0;
			while (temp[i] != ' ') {
				if (temp[i] == 'a' || temp[i] == 'e' || temp[i] == 'i' || temp[i] == 'o' || temp[i] == 'u') {
					count++;
				}
				if (count == 2 && flag == 0) {
					res += temp[i];
					flag = 1;

				}
				if (i < input.length() - 1) {
					i++;
				}
				if (i == input.length() - 1) {
					break;
				}

			}

		}
		return res;
	}

}
