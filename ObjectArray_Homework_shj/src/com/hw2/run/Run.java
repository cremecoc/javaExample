package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student[] sArr = new Student[10];
		
		int count = 0;

		while(true) {
			System.out.println("학년");
			int grade = sc.nextInt();
			
			System.out.println("반");
			int classroom = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("이름: ");
			String name = sc.nextLine();
			
			System.out.println("국어 점수: ");
			int kor = sc.nextInt();
			
			System.out.println("영어 점수: ");
			int eng = sc.nextInt();
			
			System.out.println("수학 점수: ");
			int math = sc.nextInt();
			
			sArr[count] = new Student(grade, classroom, name, kor, eng, math);
			sc.nextLine();
			
			count++;
			
			System.out.println("계속 추가하시겠습니까?(y/n)");
			char chk = sc.nextLine().charAt(0);
			
			if(chk == 'n') {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		for(int i = 0; i < count; i++) {
			System.out.println(sArr[i].information());
		}
	}

}
