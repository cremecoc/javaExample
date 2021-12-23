package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {
	private Member mem = new Member("admin", "1234", "홍길동", "901022-1062334", 163.0);
	
	public int login(String id, String pwd) {
		if(mem.getMemberId().equals(id) && mem.getMemberPwd().equals(pwd)) {
			return 1;
		} else {
			return 0;
		}
		
	}

	public Member readInfo() {
		return mem;	
	}
	
	public int readAge() {
		int age = 0;
		String sYear = mem.getCitizenNo().substring(0, 2);
		int year = Integer.parseInt(sYear) + 1900;
		age = 2021 - year + 1;
		return age;
	}

	public void updateHeight(double height) {
		mem.setHeight(height);
		
	}
	

}
