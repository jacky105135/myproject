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
		addPlayer(new Player(100, name, 0));

		// for (int i = 0; i < playerlist.size(); i++) {
		// Player player = playerlist.get(i);
		// System.out.println(player.getHP() + " " + player.getName() + " " +
		// player.getPosition());
		//
		// }

		// System.out.println("Hello,"+ name + "!!!");

	}

}
