package com.nagarro.assignment1.test.service;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.nagarro.assignment1.service.CalculatorService;

public class CalculatorTest {
	CalculatorService service = new CalculatorService();
	@Test
	public void testAddition() {
		
		
		int a=15;
		int b=15;
		int add;
		add= service.getAdd(a, b);
	
		assertEquals(30, add);
		
	}
	
	@Test
	public void testSubtraction() {
		
		int a=15;
		int b=15;
	
		int sub= service.getSub(a, b);
		
		assertEquals(0,sub);
	}
	
	@Test
	public void testMultiplication() {
		
		int a=15;
		int b=15;
	
		int mul= service.getMul(a, b);
		
		assertEquals(225,mul);
	}
	
	@Test
	public void testDivide() {
		
		int a=15;
		int b=15;
	
		int div= service.getDiv(a, b);
		
		assertEquals(1,div);
	}
	
}
