package com.java2.object;

import java.util.Random;

public class Poker {

	Random random = new Random();
	String flowers = "CDHS";
	int[] a = new int[52];

	public Poker(){
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
	}
	
	public void shuffle() {
		for (int i = 0; i < a.length; i++) {
			int target = random.nextInt(52);
			int temp = a[i];
			a[i] = a[target];
			a[target] = temp;
		}
	}

	public void show() {
		for (int i = 0; i < a.length; i++) {
			int c = a[i];
			System.out.println((c % 13) + 1 +""+ flowers.charAt(c/13));
		}
	}
}
