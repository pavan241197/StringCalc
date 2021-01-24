package com.app.Calculator;

public class StringCalculator {
	
	public static int add(String numbers) {
		if (numbers.equals(""))
			return (Integer) 0;
		else {
			String[] numberss = numbers.split(",");
			int sum = 0;
			for(int i =0;i<numberss.length;i++) {
				sum = sum+Integer.parseInt(numberss[i]);
			}
			return sum;
		}
	}

}
