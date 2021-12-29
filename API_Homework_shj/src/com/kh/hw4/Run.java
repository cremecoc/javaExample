package com.kh.hw4;

import com.kh.hw4.controller.EmpTest;

public class Run {

	public static void main(String[] args) {
		EmpTest et = new EmpTest();
		
		et.setEmp();
		
		System.out.println("=== 정렬 이전 ===");
		
		et.printEmp();
		
		et.nameSortPrint();
		
		System.out.println("=== 정렬 이후 ===");
		
		et.printEmp();

	}

}
