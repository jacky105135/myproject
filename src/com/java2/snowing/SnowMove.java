package com.java2.snowing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SnowMove extends JFrame {

	SnowCanvas canvas = new SnowCanvas();

	public SnowMove() {
		setSize(600, 800);
		setLocation(500, 500);
		add(canvas);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public class SnowCanvas extends JPanel {	//extend Canvas -> JPanel(有處理buffer: 雪不會閃爍了)
		List<Snow> list = new ArrayList<>();
		public SnowCanvas() {
			setBackground(Color.BLACK);//將畫布背景設為黑色(夜晚)
			for (int i = 0; i < 100; i++) {
				Snow snow = new Snow(this);
				list.add(snow);
				snow.start();
			}
		}
		
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < 100; i++) {
			Snow snow = list.get(i);
			g.setColor(Color.WHITE);//另顏色為白色
			g.fillOval(snow.x, snow.y, 10, 10);	//畫實心圓圈(x,y,圓的寬度,圓的高度)
			//g.drawString("雪", snow.x, snow.y);
		}
	}
	
		/*@Override
		public void paint(Graphics g) {
			for (int i = 0; i < 100; i++) {
				Snow snow = list.get(i);
				g.drawString("雪", snow.x, snow.y);
			}
			// super.paint(g);
		}*/
	}

	public static void main(String[] args) {
		new SnowMove();
		/*
		 * Snow snow = new Snow(); snow.start();
		 */
		/*
		 * List<Snow> list = new ArrayList<>(); for(int i = 0; i < 50; i++){
		 * Snow snow = new Snow(); snow.start(); list.add(snow); }
		 */
	}
}
