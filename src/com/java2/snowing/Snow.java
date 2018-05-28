package com.java2.snowing;

import java.util.Random;

import com.java2.snowing.SnowMove.SnowCanvas;

public class Snow extends Thread {
	Random r = new Random();
	int x;
	int y;
	private SnowMove.SnowCanvas snowCanvas;

	public Snow(SnowMove.SnowCanvas snowCanvas) {
		this.snowCanvas = snowCanvas;
		x = r.nextInt(600);
		y = r.nextInt(800);
	}

	@Override
	public void run() {
		// for (int i = y; i < 800; i++) {
		while (true) { // 應設置一個boolean值讓他判定是否繼續下雪
			y++;
			int movement = r.nextInt(3) - 1;
			x = x - movement;
			// System.out.println(getName() + ":(" + x + "," + y + ")");
			// System.out.println(new String(new char[x]).replace("\0", " ")+
			// "雪");
			snowCanvas.repaint(); // 必須讓畫布刷新否則不會有下雪的效果
			try {
				sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// System.out.println("0");
			// }
			if (y == 800) { // 當雪到達地面，回到出發點重下
				y = 0;
			}
		}
	}

}
