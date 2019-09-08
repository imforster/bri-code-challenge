package com.brighterion.generate_fib;

import java.math.*;

import junit.framework.TestCase;

public class FibGeneratorTest extends TestCase {

	FibGenerator fibGen = new FibGenerator();

	public void testNegativeCase() {
		assertTrue(fibGen.fib(-1).equals(BigInteger.ZERO));
	}

	public void testZeroCase() {
		assertTrue(fibGen.fib(0).equals(BigInteger.ZERO));
	}

	public void testOneCase() {
		assertTrue(fibGen.fib(1).equals(BigInteger.ONE));
	}

	public void testOneHundredCaseIsPositive() {
		System.out.println(fibGen.fib(100) + " > 0");
		assertTrue(fibGen.fib(100).compareTo(BigInteger.ZERO) == 1);
	}

	// A utility method that returns true if x is perfect square
	static boolean isPerfectSquare(BigInteger x) {
		double s = Math.sqrt(x.doubleValue());
		return (s * s == x.doubleValue());
	}

	// Returns true if n is a Fibonacci Number, else false
	static boolean isFibonacci(BigInteger n) {
		// n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or both
		// is a perfect square
		return isPerfectSquare(n.multiply(n).multiply(new BigInteger("5")).add(new BigInteger("4")))
				|| isPerfectSquare(n.multiply(n).multiply(new BigInteger("5")).subtract(new BigInteger("4")));
	}

	// Verifies that first seventy five numbers are correct.
	public void testFirstSeventyFive() {
		for (int i = 0; i < 75; i++) {
			System.out.println(fibGen.fib(i));
			assertTrue(isFibonacci(fibGen.fib(i)));
		}
	}

}
