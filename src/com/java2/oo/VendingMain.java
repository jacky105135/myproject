package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class VendingMain {

	public static void main(String[] args) {
		
		VendingMachine vm = new VendingMachine();
		FileReader file;
		try {
			file = new FileReader("Vending.txt");
			BufferedReader br = new BufferedReader(file);
			String line = br.readLine();
			String[] a = line.split(",");
			int count = Integer.parseInt(a[0]);
			for(int i = 0; i < count;i++){
				String name = a[i*2+1];
				int price = Integer.parseInt(a[i*2+2]);
				 vm.drinks.add(new Drink(i+1, name, price)) ;
			}
			vm.on();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
