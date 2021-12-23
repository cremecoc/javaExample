package com.uni.chap03.branch;

public class B_Continue {
	//continue : 반복문 안에서만 사용 가능 하며 continue 를 만나게 되면 그다음 구문은 
	//			 실행하지 말고 가장 가까운 반복문으로 올라가라는 의미

	public void method1() {
		// 1부터 10까지 홀수 출력
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				
				continue;
			} 
			System.out.println(i + " ");
		}
	}
	
	public void method2() {
		//1부터 100까지의 정수들의 합 출력
		//단, 6의 배수는 제외하고 덧셈연산 계산
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 6 == 0) {
				continue;
			}
			sum+= i;
		}
		System.out.println(sum);

	}
	
	public void method3() {
		for(int dan = 2; dan <= 9; dan++) {
			if(dan % 4 == 0) {
				continue;
			}
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
			}
		}
	}
	
	public void method4() {
		for(int dan = 2; dan <= 9; dan++) {
			for(int i = 1; i <= 9; i++) {
				if (i % 2 == 0) {
					continue;
				}
				System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
			}
		}
	}

}
