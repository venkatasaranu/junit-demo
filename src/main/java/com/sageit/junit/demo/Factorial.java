package com.sageit.junit.demo;

public class Factorial {
	public int findFactorial(int n) {
		int fact = 1;
		if(n < 0){
			throw new IllegalArgumentException("For Negative Numbers Factorial is not Possible");
		}
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
