package com.example.testController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamCoding {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 6, 7, 4);

		/*
		 * 1. Filter Even Numbers Problem: Given a list of integers, return a list
		 * containing only even numbers.
		 */
		// filterEvenNumber(numbers);

		/*
		 * 2. Find Maximum Problem: Find the maximum value in a list of integers.
		 */
		//findMaximum(numbers);

		/*
		 * 3. Sum of Elements Problem: Calculate the sum of elements in a list of
		 * integers.
		 */
		findSumofElements(numbers);
	}

	private static void filterEvenNumber(List<Integer> numbers) {
		System.out.println("All numbers ===> " + numbers);
		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("All Even numbers ===> " + evenNumbers);

	}

	private static void findMaximum(List<Integer> numbers) {
		System.out.println("All numbers ===> " + numbers);
		Optional<Integer> maxNumber = numbers.stream().max(Integer::compare);
		System.out.println("All Max number ===> " + maxNumber);
	}

	private static void findSumofElements(List<Integer> numbers) {
		System.out.println("All numbers ===> " + numbers);
		int sumOfNumbers = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("All Max number ===> " + sumOfNumbers);
	}

}
