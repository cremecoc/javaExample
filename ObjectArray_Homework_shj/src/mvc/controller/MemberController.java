package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {

	public static final int SIZE = 10; // 최대 회원 수 상수 필드로 10 초기화
	private int memberCount; // 현재 회원 수 필드
	private Member[] mem = new Member[SIZE]; // 회원 객체들을 보관할 객체 배열 (크기는 최대 회원수만큼)

	{
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}

	public int getMemberCount() {
		return memberCount;
	}

	public Member[] getMem() {
		return mem;
	}

	public Member checkId(String userId) {
		// 전달받은 회원의 아이디와 일치하는 회원 객체를 보관할 변수
		Member m = null;
		for (int i = 0; i < memberCount; i++) {
			if (mem[i].getUserId().equals(userId)) {
				m = mem[i]; // 해당 회원 객체를 m에 대입
			}
		}

		return m; // 만일 못 찾았을 경우 null 리턴
	}

	public void insertMember(Member m) {
		mem[memberCount++] = new Member(m.getUserId(), m.getUserPwd(), m.getName(), m.getAge(), m.getGender(),
				m.getEmail());
	}

	public Member searchMember(int menu, String search) {
		Member searchMember = null;

		for (int i = 0; i < memberCount; i++) {
			if (menu == 1) {

				if (mem[i].getUserId().equals(search)) {
					searchMember = mem[i];
				}

			} else if (menu == 2) {

				if (mem[i].getName().equals(search)) {
					searchMember = mem[i];
				}

			} else {

				if (mem[i].getEmail().equals(search)) {
					searchMember = mem[i];
				}

			}
		}

		return searchMember;
	}

	public void updateMember(Member m, int menu, String update) {

	}

	public void deleteMember(String userId) {

	}

	public Member[] sortIdAsc() {
		Member[] copy = null;
		return copy;
	}

	public Member[] sortIdDesc() {
		Member[] copy = null;
		return copy;
	}

	public Member[] sortAgeAsc() {
		// 위와 동일한 방식이지만 나이별 오름차순 정렬 후 주소 값 리턴
		// (숫자 비교이기 때문에 compareTo 사용X)
	}

	public Member[] sortAgeDesc() {
		// 위와 동일한 방식이지만 내림차순으로 정렬 후 주소 값 리턴
	}

	public Member[] sortGenderDesc() {
		// 위와 동일한 방식이지만 성별 별 내림차순으로 정렬 후 주소 값 리턴
		// (남여 순으로 정렬)
	}

}
