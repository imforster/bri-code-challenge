/**
 * Based on user input will generate the sequence of fibinacci numbers from 0..N where N is specified value.
 */
package com.brighterion.generate_fib;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Fib Sequence Generator Utilizes BigInteger to prevent integer rollover for
 * large values of N.
 * 
 * @author iforster
 *
 */
public class FibGenerator {

	private static Scanner scan;

	public FibGenerator() {

	}

	/**
	 * Recursive fib sequence generator with mem array to prevent repeat
	 * calculations
	 * 
	 * @param n - number in sequence to generate
	 * @return
	 */
	public BigInteger fib(int n) {
		if (n < 0)
			return BigInteger.ZERO;
		BigInteger[] mem = new BigInteger[n + 2]; // add two to avoid index error where n is 0.
		Arrays.fill(mem, BigInteger.ONE.negate());
		mem[0] = BigInteger.ZERO;
		mem[1] = BigInteger.ONE;
		return fib(n, mem);
	}

	/**
	 * Recursive function test to see if value has been calculated if so return it
	 * otherwise compute value for n.
	 * 
	 * @param n   - number in sequence to generate
	 * @param mem - array containing calculated values
	 * @return
	 */
	public BigInteger fib(int n, BigInteger[] mem) {
		if (mem[n].equals(BigInteger.ONE.negate())) {
			mem[n] = fib(n - 2, mem).add(fib(n - 1, mem));
		}
		return mem[n];
	}

	/**
	 * Main program
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		boolean done = false;
		FibGenerator fibGen = new FibGenerator();

		while (!done) {
			System.out.println("Please specify number of fibonacci numbers to generate (or <=0 to quit):");
			scan = new Scanner(System.in);
			try {
				int num = scan.nextInt();

				if (num <= 0) {
					done = true;
				} else {
					System.out.print(fibGen.fib(0));
					for (int i = 1; i < num; i++) {
						System.out.print("," + fibGen.fib(i));

					}
					System.out.println("\n\n---------------------------------------------\n");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input not a number.");
			}
		}
		System.out.println("bye.");
	}

}
