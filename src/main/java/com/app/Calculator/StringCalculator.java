package com.app.Calculator;

import java.util.Arrays;
import java.util.List;

public class StringCalculator {
	
	public static int add(String numbers) {
		if (numbers.equals(""))
			return (Integer) 0;
		else {
			List<String> numList = Arrays.asList(numbers.split("[^0-9-]+"));
			int sum = 0;
			for (String string : numList) {
				sum = sum + Integer.parseInt(string);
			}
			return sum;
		}
	}

}
