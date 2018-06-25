package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RoundSet {

	List<Integer> map = new ArrayList<>();
	int x, total;

	public void getsize() {
		try {
			FileReader file = new FileReader("bingo.txt");
			BufferedReader br = new BufferedReader(file);
			total = Integer.parseInt(br.readLine());
			x = (int) Math.sqrt(total);
			// System.out.println(x);
			for (int i = 1; i <= total; i++) {
				if (i % x == 0) {
					if (i < 10) {
						map.add(i);
						// System.out.print(" " + i);
						// System.out.println();
					} else {
						map.add(i);
						// System.out.print(i);
						// System.out.println();
					}
				} else {
					if (i < 10) {
						map.add(i);
						// System.out.print(" " + i + " ");
					} else {
						map.add(i);
						// System.out.print(i + " ");
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void shuffle() {
		Collections.shuffle(map);
	}

	public void show() {
		for (int i = 0; i < total; i++) {
			if (map.get(i) < 10) {
				System.out.print(" " + map.get(i) + " ");
			} else {
				System.out.print(map.get(i) + " ");
			}
			if ((i + 1) % x == 0) {
				System.out.println();
			}
		}
	}
}
