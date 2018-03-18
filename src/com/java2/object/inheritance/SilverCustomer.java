package com.java2.object.inheritance;

public class SilverCustomer extends Customer{
	
	public SilverCustomer(int amount){
		super(amount);
		super.discount = 0.1f;
	}
	
	public void Over5ThousandDiscount(){
		if(amount > 5000)
			amount = amount - 1000;
	}
	
	@Override
	public void print(){
		Over5ThousandDiscount();
		int total = (int)(amount*(1-discount));
		System.out.println("原價: "+amount+"\t"+"售價: "+total);
	}
}
