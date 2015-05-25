package org.vforvoltage.projecteuler.two;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t;
		t = in.nextInt();

		long[] fibArray = new long[86];
		fibArray[0] = 0;
		fibArray[1] = 1;
		for (int i = 2; i < fibArray.length; i++) {
			fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
		}

		for (int i = 0; i < t; i++) {
			long n = in.nextLong();
			long sum = 0;

			int index = 0;
			while (fibArray[index] < n) {
				index++;
			}
			index--;
			while (index % 3 != 0) {
				index--;
			}

			sum = (fibArray[index + 2] - 1) / 2;
			System.out.println(sum);
		}
	}
}
