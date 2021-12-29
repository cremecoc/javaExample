package com.kh.hw6;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ShowDate {

	public static void main(String[] args) {
		DateCalculator totalDay = new DateCalculator();
		
		Calendar calendar = Calendar.getInstance();
		boolean chk = totalDay.isLeapYear(calendar.get(GregorianCalendar.YEAR));

		if(chk == true) {
			System.out.println("올해는 윤년입니다.");
		} else {
			System.out.println("올해는 평년입니다.");
		}
	}

}
