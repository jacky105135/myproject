package com.java2.object;

public class Cars {
	
	private String brand;//品牌
	private String color;//顏色
	private int speed;//速度

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
