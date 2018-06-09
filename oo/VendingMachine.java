package com.java.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {

	List<Drink> drinks = new ArrayList<>();

	public void on() {
		System.out.println("請投入錢幣....");
		for (int i=0; i<drinks.size(); i++){
			Drink drink = drinks.get(i);
			System.out.println(drink.getId() + "\t" + drink.getName() + "\t" + drink.getPrice());
		}
		Scanner scanner = new Scanner(System.in);
		int dollar = scanner.nextInt();
		System.out.println("選擇飲料 .....");
		int id = scanner.nextInt();
		while (dollar != 0) {
			switch (id) {
			case 0:
				break;
			case 1:
				if(dollar >= 25){
					System.out.println("處理中請稍後....");
				}else{
					System.out.println("請補足差價!!!");
				}
				id = 0;
				break;
			case 2:
				if(dollar >= 30){
					System.out.println("處理中請稍後....");
				}else{
					System.out.println("請補足差價!!!");
				}
				id = 0;
				break;
			case 3:
				if(dollar >= 20){
					System.out.println("處理中請稍後....");
				}else{
					System.out.println("請補足差價!!!");
				}
				id = 0;
				break;
			default:
				break;
			}
		}
	}

}
