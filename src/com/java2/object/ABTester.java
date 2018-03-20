package com.java2.object;

import java.util.Scanner;

public class ABTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String secret = "9873";
		Scanner S = new Scanner(System.in);
		int result = 0;
		while(result != 40) {
			System.out.println("Please enter your numbers:");
			ABnumber AB = new ABnumber(S.nextLine());
			result = AB.validation(secret);
			System.out.println((result/10)+"A"+(result%10)+"B");
		}
	}

}
