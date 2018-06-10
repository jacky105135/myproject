package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayMain {

	public static void main(String[] args) {
		int position;
		PlayGround pg = new PlayGround();
		List<Integer> traps = new ArrayList<>();
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
			for (int k = 1; k <= trap; k++) {
				traps.add(r.nextInt(23));
			}
			System.out.println(traps);
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
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
