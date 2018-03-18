package com.privalia.calculatorexample.integration.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.privalia.calculatorexample.Calculator;
import com.privalia.calculatorexample.ICalculator;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class CalculatorIntegrationTest {
	
	@Test
	@Parameters({ "1,2,3",
		"-10, 30, 20",
		"15, -5, 10",
		"-5, -10, -15"})
	public void testAdd(int num1, int num2, int expectedResult) {
		ICalculator calculator = new Calculator();
		assertTrue(calculator.add(num1, num2) == expectedResult);
	}
	
	@Test
	@Parameters({ "2,1,1",
		"-10, 30, -40",
		"15, 5, 10",
		"-5, -1, -4"})
	public void testSubstract(int num1, int num2, int expectedResult) {
		ICalculator calculator = new Calculator();
		assertTrue(calculator.substract(num1, num2) == expectedResult);
	}
	
	@Test
	@Parameters({ "1,2,2",
		"-10, 30, -300",
		"15, -5, -75",
		"-5, -10, 50"})
	public void testMultiply(int num1, int num2, int expectedResult) {
		ICalculator calculator = new Calculator();
		assertTrue(calculator.multiply(num1, num2) == expectedResult);
	}
	
	@Test
	@Parameters({ "2,1,2",
		"-10, 5, -2",
		"15, 5, 3",
		"25, 5, 5"})
	public void testDivide(int num1, int num2, int expectedResult) {
		ICalculator calculator = new Calculator();
		assertTrue(calculator.divide(num1, num2) == expectedResult);
	}

}
