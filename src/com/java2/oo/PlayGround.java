package com.java2.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayGround {
	
	List<Player> playerlist = new ArrayList<>();

	public void addPlayer(Player player) {
		playerlist.add(player);
	}
	
	public void on() {
		System.out.println("請輸入玩家姓名:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		Player player = new Player(100, name, 0);
	}
	
}
