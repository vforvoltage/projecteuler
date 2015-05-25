package org.vforvoltage.projecteuler.one;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long t, n;
		long sum;
		t = in.nextInt();
		for (int i = 0; i < t; i++) {
			n = in.nextInt();
			sum = calcSum(n);
			System.out.println(sum);
		}
	}

	public static long calcSum(long n) {
		long result = sumDiv(3, n - 1) + sumDiv(5, n - 1) - sumDiv(15, n - 1);
		return result;
	}

	public static long sumDiv(long n, long p) {
		long x = (long) n * (p / n) * ((p / n) + 1) / 2;
		return x;
	}
}
