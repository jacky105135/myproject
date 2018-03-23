package com.java2.object;

import java.util.Random;

public class PokerLaundry {

	public static void main(String[] args) {

		Random random = new Random();
		int[] a = new int[52];
		String flowers = "CDHS";

		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}

		for (int i = 0; i < a.length; i++) {
			int target = random.nextInt(52);
			int temp = a[i];
			a[i] = a[target];
			a[target] = temp;
		}

		for (int i = 0; i < a.length; i++) {
			int c = a[i];
			System.out.println((c % 13) + 1 + "" + flowers.charAt(c / 13));
		}
	}

}
