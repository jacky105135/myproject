package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PlayMain {

	public static void main(String[] args) {
		int hp = 100;
		int position = 0;
		PlayGround pg = new PlayGround();
		List<String> traps = new ArrayList<>();
		Random r = new Random();
		FileReader fr;
		try {
			fr = new FileReader("maze.txt");
			BufferedReader br = new BufferedReader(fr);
			String a = br.readLine();
			String[] b = a.split(",");
			int length = Integer.parseInt(b[0]);
			int width = Integer.parseInt(b[1]);
			// System.out.println(length);
			// System.out.println(width);
			int trap = Integer.parseInt(br.readLine());
			// System.out.println(trap);
			
			int[] no1 = new int[trap];
			for (int k = 0; k <= trap - 1; k++) {
				int no = r.nextInt(23);
				no1[k] = no; 
				if (k == 0) {
					traps.add(Integer.toString(no));
					
				}else if (no1[k] == no1[k-1]) {
						no = no - 1;
						traps.add(Integer.toString(no));
					} else {
						traps.add(Integer.toString(no));
					}
				}
			
			System.out.println(traps);
			String route = br.readLine();
			String[] routes = route.split(",");

			for (int i = 0; i < width * length; i++) {
				if (i % 6 == 5 && i != 0 && i != 5) {
					System.out.println(i);
				} else if (i == 5) {
					System.out.println(" " + i + " ");
				} else if (i < 10) {
					System.out.print(" " + i + " ");
				} else {
					System.out.print(i + " ");
				}
			}

			pg.on();

			int step = 1;
			int steps = 0;

			System.out.print(routes[0] + " → ");
			for (int f = 1; f < routes.length; f++) {

				if (routes[f].equals(traps.get(0)) || routes[f].equals(traps.get(1)) || routes[f].equals(traps.get(2))
						|| routes[f].equals(traps.get(3)) || routes[f].equals(traps.get(4))) {
					hp = hp - 20 - step;
					steps++;
					if (hp > 0) {
						if (f == 14) {
							System.out.print(routes[f]);
							System.out.println();
						} else {
							System.out.print(routes[f] + " → ");
						}
					} else {
						System.out.print(routes[f]);
						System.out.println();
						break;
					}
				} else if (routes[f] != routes[f - 1]) {
					hp = hp - step;
					steps++;
					if (hp > 0) {
						if (f == 14) {
							System.out.print(routes[f]);
							System.out.println();
						} else {
							System.out.print(routes[f] + " → ");
						}
					} else {
						System.out.print(routes[f]);
						System.out.println();
						break;
					}
				}
			}
			// hp = hp - steps;

			String A = null;

			if (hp <= 0) {
				A = "死亡";
			} else if (hp >= 70) {
				A = "良好";
			} else if (hp >= 30) {
				A = "普通";
			} else {
				A = "瀕臨死亡";
			}
			// System.out.println(steps);
			if (hp <= 0) {
				System.out.println("hp left : 0");
				System.out.println("final position :" + routes[steps]);
			} else {
				System.out.println("hp left : " + hp);
				System.out.println("final position : " + routes[steps]);
			}

			System.out.println("status : " + A);

			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
