package com.hw1.run;

import com.hw1.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b = new Book();

		Book b2 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		
		System.out.println(b.information());
		System.out.println(b2.information());
		
		System.out.println("==================================================");
		
		// 첫 번째 객체를 setter를 이용해서 수정 후 출력
		b.setTitle("C언어");
		b.setAuthor("홍길동");
		b.setPrice(30000);
		b.setDiscountRate(0.1);
		
		System.out.println("수정된 결과 확인");
		System.out.println(b.information());
		
		System.out.println("==================================================");
		
		System.out.println("도서명 = " + b.getTitle());
		System.out.println("할인된 가격 = " + (b.getPrice() - (int)(b.getPrice() * b.getDiscountRate())));
		
		System.out.println("도서명 = " + b2.getTitle());
		System.out.println("할인된 가격 = " + (b2.getPrice() - (int)(b2.getPrice() * b2.getDiscountRate())));
	}

}