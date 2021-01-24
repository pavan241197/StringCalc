package com.app.Calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
	private StringCalculator stringCalculator = new StringCalculator();

	@Test
	public void addEmptyString() {
		Assert.assertEquals(0, StringCalculator.add(""));
	}

	@Test
	public void addOneNumberShouldReturnTheSameNumberAsInteger() {
		Assert.assertEquals(10, StringCalculator.add("10"));
		Assert.assertEquals(20, StringCalculator.add("20"));
	}

	@Test
	public void addTwoNumbersShouldReturnTheSum() {
		Assert.assertEquals(11, StringCalculator.add("5,6"));
	}

	@Test
	public void allowLineReturnAsSeparator() {
		Assert.assertEquals(10, StringCalculator.add("5\n5"));
	}

	@Test
	public void allowCustomDelimiter() {
		Assert.assertEquals(10, StringCalculator.add("//;6;4"));
	}

	@Test
	public void negativeNumbersShouldThrowException() {
		try {
			StringCalculator.add("-5, 3");
			fail("Expected a RuntimeException to be thrown");
		} catch (RuntimeException ex) {
			assertEquals(ex.getMessage(), "Negatives not allowed : -1");
		}
	}

	@Test
	public void AddStringWithNumbersGreaterThan1000() {
		Assert.assertEquals(3, StringCalculator.add("1,2,1000"));
	}
}
