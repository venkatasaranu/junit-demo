package com.sagit.junit.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.sageit.junit.demo.Factorial;
public class FactorialTest {
	private static Factorial factorial;

	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		factorial = new Factorial();
	}

	@Test
	public void testFactorialWithZero(){
		assertEquals(1, factorial.findFactorial(0));
	}
	
	@Test
	public void testFactorialWithPositive(){
		assertEquals(120,factorial.findFactorial(5));
	}
	
	@Test
	public void testFactorialWithNegative(){
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("For Negative Numbers Factorial is not Possible");
		factorial.findFactorial(-1);
	}
	

}
