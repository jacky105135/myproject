package com.java2.object;

import java.util.Scanner;

public class ABnumber {
	
	String number;
	
	public ABnumber(String number) {
		this.number = number;
	}
	
	public int validation(String secret) {
		
		int result = 0;
		int length = secret.length();
		
		for(int i = 0; i<length;i++) {
			char c = secret.charAt(i);
//			System.out.println(c);
			for(int j = 0;j<length;j++) {
				if(c==number.charAt(j) && i==j ) {
					result += 10;
					break;
				}else if(c==number.charAt(j) && i!=j ) {
					result +=1;
				}
			}
		}
		return result;
	}
}
