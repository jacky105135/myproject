package com.java2.object.ObjectPractice;

public class Cars {
	
	private String brand;//�~�P
	private String color;//�C��
	private int speed;//�t��

	public Cars( String a , String b){
		brand = a;
		color = b;
		speed = 0;
	}
	
	public void accelerate(){
		if(speed < 100){
			speed = speed +=10;
			System.out.println(speed+" km/hr");
		}else{
			System.out.println("The speed is at the limit");
		}
	}
	
	public void SpeedDown(){
		if(speed > 0){
			speed = speed -=5;
			System.out.println(speed+" km/hr");
		}else{
			System.out.println("The car is stopped already");
		}
	}
}
