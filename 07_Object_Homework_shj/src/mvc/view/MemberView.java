package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;

public class MemberView {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		System.out.println("아이디 입력하시오: ");
		String id = sc.nextLine();
		
		System.out.println("비밀번호 입력하시오: ");
		String pwd = sc.nextLine();
		
		int result = mc.login(id, pwd);
		
		// 성공적으로 로그인했을 경우 => result == 1
		if(result == 1) {
			while(true) {
				System.out.println("=== 회원 프로그램 === ");
				System.out.println("1. 내 정보 보기");
				System.out.println("2. 내 나이 조회하기");
				System.out.println("3. 키 수정하기");
				System.out.println("9. 프로그램 종료하기");
				System.out.println("메뉴 번호 선택: ");
				int selection = sc.nextInt();
				
				switch(selection) {
				case 1:
					System.out.println(mc.readInfo().information());
					break;
				case 2:
					System.out.println("나이: " + mc.readAge());
					break;
				case 3:
					updateHeight();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					break;
				}
			}
		} else {
			System.out.println("프로그램 종료");
		}
	}
	
	public void updateHeight() {
		System.out.println("수정할 키를 입력하시오: ");
		double height = sc.nextDouble();
		mc.updateHeight(height);
	}

}
