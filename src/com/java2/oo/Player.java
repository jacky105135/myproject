package com.java2.oo;

public class Player {
	int HP;
	String Name;
	
	public Player(int hP, String name) {
		super();
		HP = hP;
		Name = name;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
}
