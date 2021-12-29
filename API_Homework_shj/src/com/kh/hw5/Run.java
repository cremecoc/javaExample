package com.kh.hw5;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		NumberOK no = new NumberOK();
		Scanner sc = new Scanner(System.in);
		
		no.numGame();

		System.out.println("계속 하시겠습니까? (y/n): ");
		String ynChk = sc.nextLine();
		
		if(ynChk.equalsIgnoreCase("y")) {
			no.numGame();
		}
	}

}
