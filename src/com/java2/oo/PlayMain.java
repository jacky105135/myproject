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
			String route = br.readLine();
			String[] routes = route.split(",");
			int steps = 0;
			for (int f = 1; f < routes.length; f++) {
				if (routes[f] != routes[f - 1]) {
					steps = steps + 1;
				}
			}
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
			String A = null;
			if(hp <= 0){
				A = "死亡";
			}else if(hp >= 70){
				A = "良好";
			}else if(hp >= 30){
				A = "普通";
			}else{
				A = "瀕臨死亡";
			}
				
		
			pg.on();
			route = route.replaceAll(",", " → ");
			System.out.println(route);
			hp = hp - steps;
			System.out.println("hp left : "+hp);
			System.out.println("final position : "+ routes[routes.length -1]);
			System.out.println("status : "+ A);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}