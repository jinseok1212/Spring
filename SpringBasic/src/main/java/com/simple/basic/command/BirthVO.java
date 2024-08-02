package com.simple.basic.command;

public class BirthVO {
	private int year;
	private int month;
	private int day;
	private String msg;
	
	public BirthVO() {
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public BirthVO(int year, int month, int day, String msg) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.msg = msg;
	}



	@Override
	public String toString() {
		return "BirthVO [year=" + year + ", month=" + month + ", day=" + day + ", msg=" + msg + "]";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
