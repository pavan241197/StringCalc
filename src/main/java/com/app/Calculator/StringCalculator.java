package com.app.Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {

	public static int add(String numbers) {
		if (numbers.equals(""))
			return (Integer) 0;
		else {
			List<String> numList = new ArrayList<String>();
			if (numbers.startsWith("//")) {

				String delimiter = String.valueOf(numbers.charAt(2));

				numbers = numbers.split("\\n")[1];
				numList = Arrays.asList(numbers.split(delimiter));
			} else {

				numList = Arrays.asList(numbers.split("[^0-9-]+"));
			}

			for (String string : numList) {
				if (Integer.parseInt(string) < 0) {
					throw new RuntimeException("Negatives not allowed : " + string);
				}
			}
			int sum = 0;
			for (String string : numList) {
				sum = sum + Integer.parseInt(string);
			}
			return sum;
		}
	}
}
