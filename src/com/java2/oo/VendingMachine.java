package com.java2.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {

	List<Drink> drinks = new ArrayList<>();

	public void on() {
		System.out.println("請投入錢幣....");
		for (int i = 0; i < drinks.size(); i++) {
			Drink drink = drinks.get(i);
			System.out.println(drink.getId() + "\t" + drink.getName() + "\t" + drink.getPrice());
		}
		Scanner scanner = new Scanner(System.in);
		int dollar = scanner.nextInt();
		System.out.println("選擇飲料 .....");
		
		while (dollar != 0) {
			int id = scanner.nextInt();
			switch (id) {	
			case 0:
				break;
			case 1:
				if (dollar >= 25) {
					System.out.println("處理中請稍後....");
					System.out.println("您所購買的商品為: Coke");
					dollar = dollar - 25;
					System.out.println("找零:" + dollar);
					break;
				} else {
					System.out.println("請補足差價!!!");
					dollar = dollar + scanner.nextInt();
					if(dollar >= 25){
						System.out.println("處理中請稍後....");
						System.out.println("您所購買的商品為: Coke");
						dollar = dollar - 25;
						System.out.println("找零:" + dollar);
						break;
					}else{
						System.out.println("請重新操作...");
						System.out.println("請領取現金:" + dollar);
					}
				}
			//	id = 0;
				break;
			case 2:
				if (dollar >= 30) {
					System.out.println("處理中請稍後....");
					System.out.println("您所購買的商品為: Orange Juice");
					dollar = dollar - 30;
					System.out.println("找零:" + dollar);
					break;
				} else {
					System.out.println("請補足差價!!!");
					dollar = dollar + scanner.nextInt();
					if(dollar >= 25){
						System.out.println("處理中請稍後....");
						System.out.println("您所購買的商品為: Orange Juice");
						dollar = dollar - 30;
						System.out.println("找零:" + dollar);
						break;
					}else{
						System.out.println("請重新操作...");
						System.out.println("請領取現金:" + dollar);
					}
				}
			//	id = 0;
				break;
			case 3:
				if (dollar >= 20) {
					System.out.println("處理中請稍後....");
					System.out.println("您所購買的商品為: Sprite");
					dollar = dollar - 20;
					System.out.println("找零:" + dollar);
					break;
				} else {
					System.out.println("請補足差價!!!");
					dollar = dollar + scanner.nextInt();
					if(dollar >= 25){
						System.out.println("處理中請稍後....");
						System.out.println("您所購買的商品為: Sprite");
						dollar = dollar - 20;
						System.out.println("找零:" + dollar);
						break;
					}else{
						System.out.println("請重新操作...");
						System.out.println("請領取現金:" + dollar);
					}
				}
			//	id = 0;
				break;
			default:
				break;
			}
		}

	}

}
