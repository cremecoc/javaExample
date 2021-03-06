package com.uni.part01.object_vs_objectArr.run;

import java.util.Scanner;

import com.uni.part01.object_vs_objectArr.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		// ObjectTest
		
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		// 책 정보 입력받기
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(i+1 + " 번째 도서 정보 입력");
			System.out.println("제목: ");
			String title = sc.nextLine();
			
			System.out.println("저자: ");
			String author = sc.nextLine();
			
			System.out.println("가격: ");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("출판사: ");
			String publisher = sc.nextLine();
			
			if(i == 0) {
				bk1 = new Book(title, author, price, publisher);
			} else if (i == 1) {
				bk2 = new Book(title, author, price, publisher);
			} else if(i == 2) {
				bk3 = new Book(title, author, price, publisher);
			}
		}
		
		// 전체 도서 정보 조회하기
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());

		// 도서 제목 검색
		// 검색할 도서 제목 입력받기
		System.out.println("도서 제목 검색: ");
		String srch = sc.nextLine();
		
		// 입력한 제목과 일치하는 도서 찾기 if문
		// equals를 이용하여 검색
		if(bk1.getTitle().equals(srch)) {
			System.out.println(bk1.information());
		} else if(bk2.getTitle().equals(srch)) {
			System.out.println(bk2.information());
		} else if(bk3.getTitle().equals(srch)) {
			System.out.println(bk3.information());
		} else {
			System.out.println("일치하는 책이 없습니다.");
		}
	}

}
