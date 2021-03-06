package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;
import mvc.model.vo.Member;

public class MemberMenu {

	// 기능 요청용 MemberController 클래스 객체 생성
	private MemberController mc = new MemberController();
	// 키보드로 값 입력받기 위한 Scanner 클래스 객체 생성
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		while(true) {
			System.out.println("=== 회원 관리 메뉴 ===");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("9. 프로그램 종료");
			
			System.out.println("메뉴 번호 입력: ");
			int menu = sc.nextInt(); // 값 입력받기
			sc.nextLine();
			
			switch(menu) { // 입력받은 menu 값에 따라 case 설정
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAllMember();
				break;
			case 6:
				sortMember();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다");
			}
		}
	}

	private void sortMember() {
		// TODO Auto-generated method stub
		
	}

	private void printAllMember() {
		// TODO Auto-generated method stub
		
	}

	private void deleteMember() {
		// TODO Auto-generated method stub
		
	}

	private void updateMember() {
		while(true) {
		
	}

	private void searchMember() {
		// TODO Auto-generated method stub 
		while(true) {
			System.out.println("=== 회원 정보 검색 ===");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");
			
			System.out.println("메뉴 선택: ");
			int menu = sc.nextInt();
			
			sc.nextLine();
			
			if(menu == 9) {
				System.out.println("이전 메뉴로 돌아갑니다.");
				return;
			}
			
			System.out.println("검색 내용: ");			
			String search = sc.nextLine();
			
			Member searchMember = mc.searchMember(menu, search);
			
			if(searchMember == null) {
				System.out.println("검색된 결과가 없습니다.");
			} else {
				System.out.println("=== 검색 결과 ===");
				System.out.println(searchMember.information());
			}
		}
		
	}

	private void insertMember() {
		// 현재 회원수 조회
		int memberCount = mc.getMemberCount();
		
		// 1. 현재 회원수가 최대 회원 수 이상일 경우
		if(memberCount >= MemberController.SIZE) {
			System.out.println("입력할 수 있는 회원 수를 초과하셨습니다.");
			return;
		} 
		
		// 2. 아이디를 입력받아 아이디 중복체크 먼저 하기
		System.out.println("아이디 입력: ");
		String userId = sc.nextLine();
		
		// 아이디 중복 체크 요청 --> Controller
		Member chk = mc.checkId(userId);
		// chk: 일치하는 회원 있었을 경우 해당 회원 객체의 주소값, 없을 경우 null
		
		// 2_1. 결과값이  null이 아닌 경우
		if(chk != null) {
			System.out.println("동일한 아이디가 존재합니다. 회원 등록 실패.");
			// return;
		} else { // 2_2. 결과값이 null인 경우
			
			System.out.println("비밀번호 입력: ");
			String userPwd = sc.nextLine();
			
			System.out.println("이름 입력: ");
			String name = sc.nextLine();
			
			System.out.println("나이 입력: ");
			int age = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("성별 입력(M/F): ");
			char gender = sc.nextLine().charAt(0);
			
			System.out.println("이메일 입력: ");
			String email = sc.nextLine();

			Member newMem = new Member(userId, userPwd, name, age, gender, email);
			
			mc.insertMember(newMem);
			
			System.out.println("성공적으로 회원 등록이 되었습니다.");
		}
		
		
			
		
		
	}
}
