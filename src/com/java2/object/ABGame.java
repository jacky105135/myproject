package com.java2.object;

import java.util.Scanner;

public class ABGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String secret = "9873";
//		String nums = "1356";
//		String nums = "2461";
//		String nums = "7895";
//		String nums = "8793";
//		String nums = "9873";
		int A = 0,B = 0;
		int length = secret.length();
		Scanner S = new Scanner(System.in);
		while(A != 4) {
			System.out.println("Please enter your numbers:");
			A=0;
			B=0;
			String s = S.nextLine();
		for(int i = 0; i<length;i++) {
			char c = secret.charAt(i);
//			System.out.println(c);
			for(int j = 0;j<s.length();j++) {
				if(c==s.charAt(j) && i==j ) {
					A++;
					break;
				}else if(c==s.charAt(j) && i!=j ) {
					B++;
				}
			}
		}
			System.out.println(A+"A"+B+"B");
		}
	}

}
