package com.java2.object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Poker2 {

	Random random = new Random();
	String flowers = "CDHS";

	ArrayList<String> card = new ArrayList<>();

	// int[] a = new int[52];

	public Poker2() {
		for (int i = 0; i < 52; i++) {
			card.add((i % 13) + 1 +""+flowers.charAt(i / 13));
		}
	}

	public void shuffle() {
		Collections.shuffle(card);
	}

	public void show() {
		for (int i = 0; i < 52; i++) {
			System.out.print(card.get(i)+ " ");
			if ((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
	}
}
