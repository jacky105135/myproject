package com.java.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {

	List<Drink> drinks = new ArrayList<>();

	public void on() {
		System.out.println("請投入錢幣....");
		Scanner scanner = new Scanner(System.in);
		int dollar = scanner.nextInt();
		while (dollar != 0) {
			switch (dollar) {
			case 0:
				break;

			default:
				break;
			}
		}
	}

}
