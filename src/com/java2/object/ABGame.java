package com.java2.object;

import java.util.Scanner;

public class ABGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String secret = "9873";
		// String nums = "1356";
		// String nums = "2461";
		// String nums = "7895";
		// String nums = "8793";
		// String nums = "9873";
		int A = 0, B = 0;
		int length = secret.length();
		Scanner S = new Scanner(System.in);
		while (A != 4) {
			System.out.println("Please enter your numbers:");
			A = 0;
			B = 0;
			String s = S.nextLine();
			for (int i = 0; i < length; i++) {
				char c = secret.charAt(i);
				// System.out.println(c);
				for (int j = 0; j < s.length(); j++) {
					if (c == s.charAt(j) && i == j) {
						A++;
						break;
					} else if (c == s.charAt(j) && i != j) {
						B++;
					}
				}
			}
			String aa = A + "A" + B + "B";
			System.out.println(aa);
			switch (aa) {
			case "0A0B":
				System.out.println("好棒!排除4個數字了~");
				break;
			case "0A1B":
				System.out.println("找到一個摟，調調位置試試看");
				break;
			case "0A2B":
				System.out.println("加油!接近了");
				break;
			case "0A3B":
				System.out.println("調調位置試試看吧!");
				break;
			case "0A4B":
				System.out.println("哇!你是神人吧位置全部不對~");
				break;
			case "1A0B":
				System.out.println("喔!有一個對瞜");
				break;
			case "1A1B":
				System.out.println("喔!有一個對瞜，試著找出位置錯的是哪一個數字吧");
				break;
			case "1A2B":
				System.out.println("差一個數字不知道瞜，試試看排除幾個數字吧");
				break;
			case "1A3B":
				System.out.println("快成功了!");
				break;
			case "2A0B":
				System.out.println("兩個了!!");
				break;
			case "2A1B":
				System.out.println("猜猜看4個數字外的數字吧!");
				break;
			case "2A2B":
				System.out.println("離成功不遠了!");
				break;
			case "3A0B":
				System.out.println("加油就快了，差一個");
				break;
			case "3A1B":
				System.out.println("wow看來你很在行喔");
				break;
			case "4A0B":
				System.out.println("Good Job!!!");
				break;

			}
		}
	}

}
