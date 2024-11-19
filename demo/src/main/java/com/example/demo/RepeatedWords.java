package com.example.demo;

public class RepeatedWords {

	public static void main(String[] args) {
		System.out.println("hi");
		int count;
		String str = "This is a test sentence and this test is only a test";
		String words[] = str.toLowerCase().split(" ");
		System.out.println(words[0]);
		System.out.println("Duplicate words in the given string:");
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}
			if (count > 1 && !words[i].equals("0")) {
				System.out.println(words[i] + " : " + count);
			}
		}
	}
}
