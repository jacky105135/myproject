package com.java2.object.inheritance;

public class GoldenCustomer extends SilverCustomer {
	
	int returnMoney;
	
	public GoldenCustomer(int amount) {
		super(amount);
	}
	

	public void Over10ThousandDiscount(){
		if(amount >= 10000)
			amount = amount - 2000;
		else if(amount>5000 && amount <9999){
			Over5ThousandDiscount();
		}
			
	}
	
	@Override
	public void print(){
		returnMoney = (int)(amount*(discount));
		Over10ThousandDiscount();
		int total = (int)(amount*(1-discount));
		System.out.println("原價: "+ amount +"\t"+"售價: "+ total + "\t" +" 回饋禮卷總金額: "+ returnMoney );
	}

}
