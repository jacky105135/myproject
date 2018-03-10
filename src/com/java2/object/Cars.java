package com.java2.object;

public class Cars {
	String brand;//品牌
	String color;//顏色
	int speed;//速度

	public Cars( String a , String b){
		brand = a;
		color = b;
		speed = 0;
	}
	
	public void accelerate(){
		int aa = 10;//加速度
		int t = 0;
		if(speed < 200){
			t++;
			speed = speed + aa * t;
		}else{
			System.out.println("The speed is at the limit");
		}
	}
	
	public void SpeedDown(){
		int bb = -10;
		int t = 0;
		if(speed == 0){
			t++;
			speed = speed + bb * t;
		}else{
			System.out.println("The car is stop already");
		}
	}
}
