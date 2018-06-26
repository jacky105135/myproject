package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RoundSet {

	// Bingo b = new Bingo();
	List<Integer> circle = new ArrayList<>();// 被選到數字的position
	List<Integer> map = new ArrayList<>();// bingo地圖
	List<Bingo> bingo = new ArrayList<>();
	int x, total;
	String[] read;

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
			String a = br.readLine();
			read = a.split(",");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void shuffle() {
		Collections.shuffle(map);// 將地圖打亂排序
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
			bingo.add(new Bingo(map.get(i), i));// 將地圖加入bingo類別
		}
	}

	/*
	 * public void getposition() { for (int i = 0; i < read.length; i++) {
	 * System.out.print(read[i]+" "); int checknum = Integer.parseInt(read[i]);
	 * //System.out.println(b.getposition(checknum)); } }
	 */

	public void getposition() {
		for (int i = 0; i < read.length; i++) {
			int checknum = Integer.parseInt(read[i]);
			for (Bingo b : bingo) {
				if (!b.getposition(checknum)) {
					System.out.print(b.getPosition() + " ");
					circle.add(b.getPosition());
				}
			}
		}
	}

	public void setbacktable() {
		int[] tableset = new int[total];

		for (int i = 0; i < total; i++) {
			for (int k = 0; k < read.length; k++) {
				if (i == circle.get(k)) {
					tableset[i] = 1;
					if (i == 0) {
						System.out.print(tableset[i] + " ");
					} else if (i % 5 == 4) {
						System.out.print(tableset[i]);
						System.out.println();
					} else {
						System.out.print(tableset[i] + " ");
					}
				} else {
					if (i == 0) {
						tableset[i] = 0;
						System.out.print(tableset[i] + " ");
						break;
					} else if (i % 5 == 4) {
						tableset[i] = 0;
						System.out.print(tableset[i]);
						System.out.println();
						break;
					} else {
						tableset[i] = 0;
						System.out.print(tableset[i] + " ");
						break;
					}
				}
			}
		}
	}
}
