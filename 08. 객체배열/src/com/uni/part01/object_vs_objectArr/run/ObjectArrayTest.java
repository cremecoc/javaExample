package com.uni.part01.object_vs_objectArr.run;

import java.util.Scanner;

import com.uni.part01.object_vs_objectArr.model.vo.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {

		// 1. 기본자료형 배열
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println(arr); // 배열의 주소값 출력
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		// arr의 자료형: int[] --> 레퍼런스 변수 == 주소값을 가지는 변수
		// arr[index]의 자료형: int --> 일반변수 == 실제값을 가지는 변수
		
		// 2. 객체들을 여러 개 담을 때 객체 배열을 사용
		Book[] books = new Book[3];
		
		// books의 자료형: Book[] --> 레퍼런스 변수 == 주소값을 가지는 변수
		// book[index]의 자료형: Book --> 레퍼런스 변수 == 주소값을 가지는 변수
		
		// books[index] = 객체 생성;
		
		books[0] = new Book();
		books[1] = new Book();
		books[2] = new Book();
		
		System.out.println(books); // 주소값 출력
		System.out.println(books[0]); // 주소값 출력
		
		// 실제 값을 가져오려면 get 이용
		// 실제 값이 들어가 있는 곳은? books[index] 객체의 각 필드로 접근
		// System.out.println(books[0].getPrice()); 
		// books[0].getPrice()의 자료형 int --> 실제값을 가지고 있다.
		
		Scanner sc = new Scanner(System.in);
		
		// for문을 이용하여 books[]에 값 넣기
/*		for(int i = 0; i < books.length; i++) {
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
			
			// books의 i번째에 값 넣기
			books[i] = new Book(title, author, price, publisher);
		}

		
		// 전체 도서 정보 조회하기
		for(int i = 0; i < books.length; i++) {
			System.out.println(books[i].information());
		}
		// 도서 제목 검색
		// 검색할 도서 제목 입력받기
		System.out.println("도서 제목 검색: ");
		String srch = sc.nextLine();
		
		// 일반 for문 --> for loop문
		for(int i = 0; i < books.length; i++) {
			if(books[i].getTitle().equals(srch)) {
				System.out.println(books[i].information());
			}
		}
	*/	
		// 향상된 for문 --> for each문
		for(int num : arr) {
			System.out.println(num);
		}
		
		for(Book b : books) {
			System.out.println(b.information());
		}
		
	}

}
