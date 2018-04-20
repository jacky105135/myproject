package com.java2.io;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

import com.java2.object.inheritance.Customer;
import com.java2.object.inheritance.GoldenCustomer;
import com.java2.object.inheritance.SilverCustomer;

public class Sogo {

	Scanner scan = new Scanner(System.in);

	public Sogo() {

	}

	public void start() {
		int function = 0;
		while (function != 3) {
			showfunction();
			function = scan.nextInt();
			switch (function) {
			case 1:
				showfile();
				break;
				
			case 2:
				List<Sales> list = new ArrayList<>();
				try {
					FileInputStream fis = new FileInputStream("sales.txt");
					InputStreamReader isr = new InputStreamReader(fis);// InputStreamReader屬於Reader類別
					BufferedReader br = new BufferedReader(isr);
					String line = br.readLine();
					while (line != null) {
						String[] token = line.split("\t");
						try {
							int type = Integer.parseInt(token[0]);
							int amount = Integer.parseInt(token[1]);
							Sales sales = new Sales(type,amount);
							list.add(sales);
						} catch (NumberFormatException e) {
							System.out.println("資料格式有誤");
						}
						line = br.readLine();

					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//report
				for(Sales sales:list){
					Customer customer = null;
					switch(sales.type){
					case 1: 
						customer = new Customer(sales.getAmount());
						break;
					case 2:
						customer = new SilverCustomer(sales.getAmount());
						break;
					case 3:
						customer = new GoldenCustomer(sales.getAmount());
						break;
					}
					customer.print();
				}
				break;
				
			case 3:
				return;
			}
		}
	}

	public void showfile() {
		try {
			FileOutputStream file = new FileOutputStream("sales.txt", true);// append表示直接編輯在文件後，不會洗掉原本的檔案
			PrintStream out = new PrintStream(file);
			System.out.print("請輸入會員等級:");
			int type = scan.nextInt();
			System.out.print("請輸入銷售金額:");
			int amount = scan.nextInt();
			out.println(type + "\t" + amount);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void showfunction() {
		System.out.println("請輸入功能(1~3):");
		System.out.println("1)輸入銷售紀錄");
		System.out.println("2)印出銷售報表");
		System.out.println("3)結束程式");
	}
	
	public static void main(String[] args) {
		Sogo sogo = new Sogo();
		sogo.start();
	}

}
