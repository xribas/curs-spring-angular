package com.privalia.calculatorexample.unit.test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.privalia.calculatorexample.ICalculator;

public class CalculatorTest {

	@Mock
	ICalculator iCalculator;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this); // Instancia tots els mocks
	}
	
	@Test
	public void testAdd() {
		when(iCalculator.add(2, 3)).thenReturn(5);
		assertTrue(iCalculator.add(2, 3) == 5);
	}
	
	@Test
	public void testSubstract() {
		when(iCalculator.substract(3, 2)).thenReturn(1);
		assertTrue(iCalculator.substract(3, 2) == 1);
	}
	
	@Test
	public void testMultiply() {
		when(iCalculator.multiply(2, 3)).thenReturn(6);
		assertTrue(iCalculator.multiply(2, 3) == 6);
	}
	
	@Test
	public void testDivide() {
		when(iCalculator.divide(6, 2)).thenReturn(3);
		assertTrue(iCalculator.divide(6, 2) == 3);
	}
}
