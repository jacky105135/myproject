package com.java2.object.inheritance;

public class Customer implements Destroyable {
	
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

	@Override  // 加入implements(認乾爹) 就要有它的方法
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
