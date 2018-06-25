package com.java2.schedule;

public class Course {
	String id;
	String name;
	String day;
	String starttime;
	String duration;

	public Course() {

	}

	public Course(String id, String name, String day, String starttime, String duration) {
		super();
		this.id = id;
		this.name = name;
		this.day = day;
		this.starttime = starttime;
		this.duration = duration;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public boolean isAvailable(String checkday, String checkstarttime) {
		boolean a = true;
		int time = Integer.parseInt(getStarttime()) + Integer.parseInt(getDuration());
		if (checkday.equals(getDay()) && Integer.parseInt(getStarttime()) <= Integer.parseInt(checkstarttime)
				&& time >= Integer.parseInt(checkstarttime)) {
			a = false;
		}
		return a;
	}

}
