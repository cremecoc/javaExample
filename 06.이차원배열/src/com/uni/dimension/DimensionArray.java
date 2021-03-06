package com.uni.dimension;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DimensionArray {
	
	// 이차원배열: 일차원배열 여러 개를 하나로 묶은 것
	
	public void method1() {
		/*
		 * 
		 * 1. 이차원 배열 선언
		 * 자료형 배열명[][];
		 * 자료형[] 배열명[];
		 * 자료형[][] 배열명;
		 * 
		 */
		
		int arr1[][];
		int[] arr2[];
		int[][] arr;
		
		/*
		 * 2. 이차원 배열 할당
		 * 배열명 = new 자료형[행크기][열크기];
		 * 
		 */
		
		arr = new int [3][5]; // 할당을 하게 되면 heap 영역에 해당 크기만큼 공간이 할당
		
		// 행의 길이
		System.out.println("행의 길이: " + arr.length);
		
		// 열의 길이
		System.out.println("열의 길이: " + arr[0].length);
		System.out.println("열의 길이: " + arr[1].length);
		System.out.println("열의 길이: " + arr[2].length);
		
		// *****
		// *****
		// *****
		
		// 바깥쪽 for문 --> 행의 개수만큼 반복
		// 안쪽 for문 --> 열의 개수만큼 반복
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) { // 해당 행의 크기를 알면 되니까 arr[i].length
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void method2() {
		int[][] arr = new int[3][5];
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		
		// 1. 인덱스에 접근하여 값 기록
		/*
		 * arr[0][0] = 1; arr[0][1] = 2; arr[0][2] = 3; arr[0][3] = 4; arr[0][4] = 5;
		 * 
		 * arr[1][0] = 6; arr[1][1] = 7; arr[1][2] = 8; arr[1][3] = 9; arr[1][4] = 10;
		 * 
		 * arr[2][0] = 11; arr[2][1] = 12; arr[2][2] = 13; arr[2][3] = 14; arr[2][4] =
		 * 15;
		 */
		
		// 2. 중첩 for문을 이용해서 값 기록
		int value = 1; // 값을 넣어 줄 변수
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void method3() {
		// 2차원 배열의 할당과 동시에 초기화
		int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void method4() {
		//가변배열
		//행은 정해졌으나 각 행에 대한 열의 갯수가 정해지지않은 상태 
		//자료형이 같은 1차원 배열 여러개를 하나로 묶은게 --> 2차원배열 
		//묶여있는 1차원 배열의 길이가 꼭 같을 필요는 없다.
		
		int[][] arr = new int[3][]; // 가변 배열 할당(행의 크기는 3)
		
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
		
		// 1. 인덱스로 접근
		
		/* arr[0][0] = 1; 
		 * 
		 * 
		 * */

		int value = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public void method5() {
		int[][] arr = {{1, 2}, {3}, {4, 5, 6}};
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public void method6() {
		// Scanner 이용해서 국어 점수와 영어 점수를 3번 찍어서 각각 평균을 구하시오
		Scanner sc = new Scanner(System.in);
		
		double[][] arr = new double[2][4];
		
		int arrILgth = 0; // length
		
		for(int i = 0; i < arr.length; i++) {
			arrILgth = arr[i].length - 1; // 합 넣을 인덱스의 행
			double sum = 0; // 행의 합
			for(int j = 0; j < arr[i].length - 1; j++) {
				if (i == 0) {
					System.out.println("국어 점수 입력: ");
				} else {
					System.out.println("영어 점수 입력: ");
				}
				arr[i][j] = sc.nextDouble();
				sum += arr[i][j];
			}
			arr[i][arrILgth] = sum;
		}
		
		for(int i = 0; i < arr.length; i++) { 
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		
		System.out.println("국어 점수 평균: " + arr[0][arrILgth] / arrILgth);
		System.out.println("영어 점수 평균: " + arr[1][arrILgth] / arrILgth);
		
		DecimalFormat f1 = new DecimalFormat("0.00"); // 값이 딱 안 떨어질 수도 있으니까 format 값을 준다
		
		System.out.println("영어 점수 평균: " + f1.format(arr[1][arrILgth] / arrILgth)); // f1.format(평균값 format 해 준 값)
	}
	
	public void method7() {
		//1부터 10사이의 랜덤값을 3행 3열에 값을 넣으려고 한다.
		//중복제거해서 넣어보세요

		// 1. 일차원 배열을 이용해서 먼저 중복 제거
		int[] arr = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		// 2. 2차원 배열을 3행 3열로 담기
		int[][] newArr = new int[3][3];
		
		int index = 0; // 1차원 배열 index 값을 가져오기 위한 변수
		
		for(int i = 0; i < newArr.length; i++) {
			for(int j = 0; j < newArr[i].length; j++) {
				newArr[i][j] = arr[index++];
			}
		}
		for(int i = 0; i < newArr.length; i++) {
			for(int j = 0; j < newArr[i].length; j++) {
				System.out.print(newArr[i][j] + " ");
			}
			
			System.out.println();
		}
		
	}
	
	// 빙고
	
	public void bingo() {
		// 1차원 배열로 중복 제거된 25개 값을 구해 놓고 2차원 배열에 대입
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[25];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 25 + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		int[][] newArr = new int[5][5];
		
		int index = 0; // 1차원 배열 index 값을 가져오기 위한 변수
		
		for(int i = 0; i < newArr.length; i++) {
			for(int j = 0; j < newArr[i].length; j++) {
				newArr[i][j] = arr[index++];
			}
		}
		
		// 배열 출력
		for(int i = 0; i < newArr.length; i++) {
			for(int j = 0; j < newArr[i].length; j++) {
				System.out.print(newArr[i][j] + " ");
			}
			
			System.out.println();
		}
		
		int count = 0;
		System.out.println("====== 빙고게임 시작 ======");
		while(true)	{
			System.out.println("정수를 입력하세요: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			count++;
			
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					if(newArr[i][j] == num) {
						newArr[i][j] = 0;
					}
					System.out.print(newArr[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.println("게임을 끝내시겠습니까? (y/n)");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			if (ch == 'Y') {
				break;
			}
		}
		
		System.out.println(count + "번 입력하였습니다.");
	}

}
