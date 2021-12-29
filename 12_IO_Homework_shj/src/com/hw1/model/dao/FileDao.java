package com.hw1.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {
	
	Scanner sc = new Scanner(System.in);
	
	public FileDao() {
		// TODO Auto-generated constructor stub
	}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			System.out.println("파일에 저장할 내용을 반복해서 입력하시오(exit를 입력하면 내용 입력 끝): ");
			String str = sc.nextLine();
			if(str.equals("exit")) {
				break;
			} else {
				sb.append(str);
			}
		}
		
		System.out.println("저장하시겠습니까? (y/n)");
		String ynChk = sc.nextLine();
		if(ynChk.equalsIgnoreCase("y")) {
			System.out.println("제목: ");
			String title = sc.nextLine();
			
			BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter(title + ".txt"));
				bw.write(sb.toString());
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("다시 메뉴로 돌아갑니다");
			return;
		}
		
	}
	
	public void fileOpen() {
		
		System.out.println("열기 할 파일명: ");
		String title = sc.nextLine();
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(title));
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("존재하는 파일이 없습니다");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void fileEdit() {
		// 파일명 입력받기
		System.out.println("수정할 파일명: ");
		String title = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new FileReader(title));
			String temp = null;
			while((temp = br.readLine()) != null) {
				sb.append(temp);
			}
			
			while(true) {
				System.out.println("파일에 추가할 내용을 반복해서 입력하시오(exit를 입력하면 내용 입력 끝): ");
				String str = sc.nextLine();
				if(str.equals("exit")) {
					break;
				} else {
					sb.append(str);
				}
			}
			
			System.out.println("변경된 내용을 파일에 추가하시겠습니까? (y/n)");
			String ynChk = sc.nextLine();
			
			if (ynChk.equalsIgnoreCase("y")) {
				bw = new BufferedWriter(new FileWriter(title));
				bw.write(sb.toString());
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
