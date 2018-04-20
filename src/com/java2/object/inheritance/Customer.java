package com.java2.object.inheritance;

public class Customer {
	int amount;
	float discount = 0.05f;
	public Customer(int amount){
		this.amount = amount;
	}
	
	public Customer(Object amount2) {
		// TODO Auto-generated constructor stub
	}

	public void print(){
		
		int total = (int)(amount*(1-discount));
		System.out.println("原價: "+amount+"\t"+"售價: "+total);
		
	}
}
