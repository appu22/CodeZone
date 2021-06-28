package test.aumnics;

public class Test {

	public static void main(String[] args) {

		String s1 = "welcome to programming round one";
		String solveVowel = Test.solveVowel(s1);
		System.out.println("Output : " + solveVowel);
	}

	private static String solveVowel(String input) {
		String res = "";
		char[] temp = input.toCharArray();
		for (int i = 0; i < temp.length; i++) {
			int count = 0;
			int flag = 0;
			while (temp[i] != ' ') {
				if (temp[i] == 'a' || temp[i] == 'e' || temp[i] == 'i' || temp[i] == 'o' || temp[i] == 'u') {
					count++;
					System.out.print(temp[i]+" ");					
				}
				
				if (count == 3 && flag == 0) {
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
