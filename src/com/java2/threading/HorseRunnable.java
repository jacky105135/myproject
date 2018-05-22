package com.java2.threading;

public class HorseRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 100;i++){
			System.out.println("R:" + i);
		}
		try{
			
				Thread.sleep(50);
		
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
