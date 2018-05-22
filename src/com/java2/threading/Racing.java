package com.java2.threading;

import java.util.ArrayList;
import java.util.List;

public class Racing {

	public static void main(String[] args) {
		
	/*List<Horse> horses = new ArrayList<>();
		for(int i = 0; i < 8; i++){
			Horse h = new Horse();
			horses.add(h);
			h.start();
		}*/
		
		Horse h1 = new Horse();
		h1.start();
		
		HorseRunnable h2 = new HorseRunnable();
		Thread t1 = new Thread(h2);
		t1.start();
		try{
			h1.join();
			t1.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
