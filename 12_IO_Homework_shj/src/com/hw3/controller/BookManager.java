package com.hw3.controller;

import java.util.Calendar;
import java.util.Scanner;

import com.hw3.model.vo.Book;

public class BookManager {

	Scanner sc = new Scanner(System.in);
	
	public BookManager() {
		
	}
	
	public void fileSave() {
		// Book 객체를 받을 객체 배열
		Book[] bk = new Book[5];
		
		// 객체 배열 초기화
		bk[0] = new Book("C언어", "김씨", 10000, setCalendar(2012, 2, 2), 0.1);
		bk[1] = new Book("자바", "이씨", 20000, setCalendar(2013, 3, 3), 0.2);
		bk[2] = new Book("C++", "박씨", 30000, setCalendar(2014, 4, 4), 0.3);
		bk[3] = new Book("넛지", "서씨", 40000, setCalendar(2015, 5, 5), 0.4);
		bk[4] = new Book("개미", "최씨", 50000, setCalendar(2016, 6, 6), 0.5);
		
		// try with resource 구문으로
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("books.dat"))) {
			
		}
	}
	
	public Calendar setCalendar(int year, int month, int date) {
		
	}
	
	public void fileRead() {
		
	}
}
