package mvc.view;

import java.util.Scanner;

import mvc.controller.LibraryManager;
import mvc.model.vo.AniBook;
import mvc.model.vo.Book;
import mvc.model.vo.CookBook;
import mvc.model.vo.Member;

public class LibraryMenu {

	private LibraryManager lm = new LibraryManager();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.println("이름: ");
		String name = sc.nextLine();
		
		System.out.println("나이: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("성별: ");
		char gender = sc.nextLine().charAt(0);
		
		// 회원 객체 생성
		Member m = new Member(name, age, gender);
		
		// LibraryManager의 inserMember()에 회원 정보 전달
		lm.insertMember(m);
		
		while(true) {
			System.out.println("=== 메뉴 ===");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			System.out.println("메뉴 번호 입력: ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				String s = lm.myInfo().toString();
				System.out.println(s);
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 0: 
				System.out.println("프로그램 종료");
				return;
			}
		}
		
	}
	
	public void selectAll() {
		Book[] bList = lm.selectAll();
		for(int i = 0; i < bList.length; i++) {
			System.out.println(i + "번도서: " + bList[i].getTitle() + " / " + bList[i].getAuthor() + " / " + bList[i].getAuthor());
		}
	}
	
	public void searchBook() {
		sc.nextLine();
		System.out.println("검색할 제목 키워드: ");
		String keyword = sc.nextLine();
		Book[] searchList = lm.searchBook(keyword);
		
		for(Book b : searchList) {
			if(b instanceof CookBook) {
				System.out.println(((CookBook)b).toString());
			} else if (b instanceof AniBook) {
				System.out.println(((AniBook)b).toString());
			}
		}
	}
	
	public void rentBook() {
		// 도서번호를 알기 위한 도서 목록 출력
		selectAll();
		
		System.out.println("대여할 도서 번호 선택: ");
		int num = sc.nextInt();
		
		
		int result = lm.rentBook(num);
		
		if(num == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if(num == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else if (num == 2){
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
		}
		
	}
}
