package com.java2.object;

public class SilverCustomer extends Customer{
	
	public SilverCustomer(int amount){
		super(amount);
		super.discount = 0.1f;
	}
	
	public void OverAThousandDiscount(){
		if(amount > 1000)
			amount = amount - 500;
	}
	
	@Override
	public void print(){
		OverAThousandDiscount();
		int total = (int)(amount*(1-discount));
	}
}
