package com.java2.oo;

public class MainBingo {

	public static void main(String[] args) {
		RoundSet set = new RoundSet();
		set.getsize();
		set.shuffle();
		set.show();
		System.out.println();
		set.getposition();
	}

}
