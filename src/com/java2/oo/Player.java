package com.java2.oo;

public class Player {
	int HP;
	String Name;
	int Position;
	
	public Player(int hP, String name,int position) {
		super();
		HP = hP;
		Name = name;
		Position = position; 
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

	public int getPosition() {
		return Position;
	}

	public void setPosition(int position) {
		Position = position;
	}
	
}
