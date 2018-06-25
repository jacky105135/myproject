package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Schedule {

	List<Course> courses = new ArrayList<>();

	public void readSchedule() {
		try {

			FileReader file = new FileReader("Schedule.txt");
			BufferedReader br = new BufferedReader(file);
			String course = br.readLine();
			while (course != null) {
				String[] a = course.split(",");
				courses.add(new Course(a[0], a[1], a[2], a[3], a[4]));
				course = br.readLine();

			}
			for (Course c : courses) {
				System.out.println(c.getId() + " " + c.getName() + " " + c.getDay() + " " + c.getStarttime() + " "
						+ c.getDuration());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void on() {
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入星期(1-7):");
		String checkday = s.nextLine();
		System.out.println("請輸入時(0-24):");
		String checkstarttime = s.nextLine();
		boolean pass = true;
		for (Course c : courses) {
			if (!c.isAvailable(checkday, checkstarttime)) {
				int time = Integer.parseInt(c.getStarttime()) + Integer.parseInt(c.getDuration());
				System.out.println("[有課: " + c.getId() + " " + c.getName() + " " + "到 " + time + "時");
				pass = false;
			}
		}
		if (pass) {
			System.out.println("[有空檔]");
		}
	}
}
