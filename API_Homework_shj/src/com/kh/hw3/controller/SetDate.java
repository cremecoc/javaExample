package com.kh.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SetDate {

	public SetDate() {
		// TODO Auto-generated constructor stub
	}
	
	public String todayPrint() {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String todayStr = sdf.format(today);
		return todayStr;
	}
	
	public String SetDay() {
		Date days = new Date(111, 2, 21);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		String daysStr = sdf.format(days);
		return daysStr;
		
	}
}
