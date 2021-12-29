package com.kh.hw6;

import java.util.GregorianCalendar;

public class DateCalculator {

	public DateCalculator() {
		// TODO Auto-generated constructor stub
	}
	
	public long leapDate() {
		
	}
	
	public boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		if(gc.isLeapYear(year)) {
			return true;
		} else {
			return false;
		}
	}
}
