package com.java2.object;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cars a = new Cars("Toyota","black");
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
		
			String b = sc.next();
			
			switch(b){
			
			case "+":
				a.accelerate();
				break;
				
			case "-":
				a.SpeedDown();
				break;
				
			default:
					break;
			}
			
		}
		
	}

}
