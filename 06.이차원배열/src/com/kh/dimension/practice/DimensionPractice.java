package com.kh.dimension.practice;

import java.util.Scanner;

public class DimensionPractice {
	
	public void practice1() {
		// 1. 1차원 배열의 1~16 값 넣기
		int[] arr = new int[16];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		int[][] arr2 = new int[4][4];
		int num = 0;
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) { // i행의 열 값 구하기
				arr2[i][j] = arr[num++]; 
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[] arr = new int[16];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		int[][] arr2 = new int[4][4];
		int num = arr.length - 1; // arr 배열 마지막 인덱스
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) { // i행의 열 값 구하기
				arr2[i][j] = arr[num--]; // 거꾸로 저장
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		String[][] arr = new String[3][3];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) { // i행의 열 값 구하기
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public void practice4() {
		int[][] arr = new int[4][4];
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr[i].length - 1; j++) {
				int random = (int)(Math.random() * 10 + 1);
				arr[i][j] = random;
			}
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			int iSum = 0;
			for(int j = 0; j < arr.length - 1; j++) {
				iSum += arr[j][i];
			}
			arr[3][i] = iSum;
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			int jSum = 0;
			for(int j = 0; j < arr.length - 1; j++) {
				jSum += arr[i][j];
			}
			arr[i][3] = jSum;
		}
		
		int aSum = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr[i].length - 1; j++) {
				aSum += arr[i][j];
			}
			arr[3][3] = aSum;
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("\t %d", arr[i][j]);
			}
			
			System.out.println();
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("행 크기: ");
			int jNum = sc.nextInt();
			
			System.out.println("열 크기: ");
			int iNum = sc.nextInt();
			
			char[][] arr = new char[iNum][jNum];
			
			
			if (iNum <= 10 && iNum >= 1 && jNum <= 10 && jNum >= 1) {
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[i].length; j++) {
						int random = (int)(Math.random() * 10 + 1);
						arr[i][j] = (char)(random + 64);
						System.out.print(arr[i][j]);
					}
					System.out.println(" ");
				}
				break;
			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
			
		}
		
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"},
			{"원", "열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"},
			{"열", "히", "! ", "더", "!! "}};
			
			for(int i = 0; i < strArr.length; i++) {
				for(int j = 0; j < strArr[i].length; j++) {
					System.out.printf("\t %s", strArr[i][j]);
				}
				
				System.out.println();
			}
			for(int i = 0; i < strArr.length; i++) {
				for (int j = 0; j < strArr[i].length; j++) {
					String temp = strArr[i][j];
					strArr[i][j] = strArr[j][i];
					strArr[j][i] = temp;
				}
			}
			
			for(int i = 0; i < strArr.length; i++) {
				for(int j = 0; j < strArr[i].length; j++) {
					System.out.printf("\t %s", strArr[i][j]);
				}
				
				System.out.println();
			}
			
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("행의 크기: ");
		int iNum = sc.nextInt();
		
		char[][] arr = new char[iNum][];
		
		for(int i = 0; i < iNum; i++) {
			System.out.println(i + "행의 크기: ");
			int jNum = sc.nextInt();
			arr[i] = new char[jNum];
		}
		
		char ch = 97;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ch++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%c ", arr[i][j]);
			}
			
			System.out.println();
		}
	}
	
	public void practice8() {
		String[] arr = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실",
				"윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String[][] newArr = new String[3][2];
		String[][] newArr2 = new String[3][2];
		int num = 0;
		while(num < arr.length) {
			if (num < 6) {
				for(int j = 0; j < newArr.length; j++) {
					for(int k = 0; k < newArr[j].length; k++) {
						newArr[j][k] = arr[num++];
					}
				}
			} else {
				for(int j = 0; j < newArr2.length; j++) {
					for(int k = 0; k < newArr2[j].length; k++) {
						newArr2[j][k] = arr[num++];
					}
				}
			}
		}
			
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < newArr.length; i++) {
			for(int j = 0; j < newArr[i].length; j++) {
				System.out.printf("%s ", newArr[i][j]);
			}
			
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for(int i = 0; i < newArr2.length; i++) {
			for(int j = 0; j < newArr2[i].length; j++) {
				System.out.printf("%s ", newArr2[i][j]);
			}
			
			System.out.println();
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실",
				"윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String[][] newArr = new String[3][2];
		String[][] newArr2 = new String[3][2];
		int num = 0;
		while(num < arr.length) {
			if (num < 6) {
				for(int j = 0; j < newArr.length; j++) {
					for(int k = 0; k < newArr[j].length; k++) {
						newArr[j][k] = arr[num++];
					}
				}
			} else {
				for(int j = 0; j < newArr2.length; j++) {
					for(int k = 0; k < newArr2[j].length; k++) {
						newArr2[j][k] = arr[num++];
					}
				}
			}
		}
			
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < newArr.length; i++) {
			for(int j = 0; j < newArr[i].length; j++) {
				System.out.printf("%s ", newArr[i][j]);
			}
			
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for(int i = 0; i < newArr2.length; i++) {
			for(int j = 0; j < newArr2[i].length; j++) {
				System.out.printf("%s ", newArr2[i][j]);
			}
			
			System.out.println();
		}
		
		System.out.println("====================================");
		
		System.out.println("검색할 학생 이름을 입력하세요: ");
		String sch = sc.nextLine();
		
		for(int i = 0; i < newArr.length; i++) {
			for(int j = 0; j < newArr[i].length; j++) {
				if(newArr[i][j] == sch) {
					System.out.println("검색하신 학생은 " + i + "분단 " + j + "번째 줄 오른쪽에 있습니다.");
				}
			}
		}
		for(int i = 0; i < newArr2.length; i++) {
			for(int j = 0; j < newArr2[i].length; j++) {
				if(newArr2[i][j] == sch) {
					System.out.println("검색하신 학생은 " + i + "분단 " + j + "번째 줄 오른쪽에 있습니다.");
				}
			}
		}
	}

}
