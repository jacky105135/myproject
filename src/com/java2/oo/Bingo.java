package com.java2.oo;

public class Bingo {
	int number;
	int position;
	
	public Bingo(int number, int position) {
		super();
		this.number = number;
		this.position = position;
	}

	public Bingo() {
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public boolean getposition(int checknum) {
		boolean show = true;
		if(checknum == getNumber()){
			show = false;
		}
		return show;
	} 
	
}
