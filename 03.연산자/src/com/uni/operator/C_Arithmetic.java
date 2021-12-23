package com.uni.operator;

public class C_Arithmetic {
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		
		System.out.println("num1 + num2 = "+ (num1 + num2));
		System.out.println("num1 - num2 = "+ (num1 - num2));
		System.out.println("num1 * num2 = "+ (num1 * num2));// 곱하기
		System.out.println("num1 / num2 = "+ (num1 / num2));// 나누기의 몫
		System.out.println("num1 % num2 = "+ (num1 % num2));// 나누기의 나머지
		
		// 값 % 2 == 0 --> 짝수
		// 값 % 2 == 1 --> 홀수
		
		// 값 % 5 == 0 --> 5의 배수

	}
	
	public void method2() {
		double a = 35;
		double b = 10;
		
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
		double sum = a + b; 
		System.out.println("a + b = "+ sum);
		
		
		double sub = a - b; 
		System.out.println("a - b = "+ sub);
		
		
		double mul = a * b; 
		System.out.println("a * b = "+ mul);
		
		
		double div = a / b; 
		System.out.println("a / b = "+ div);
		
		
		double mod = a % b;
		System.out.println("a % b = " + mod);
		
		int c = 27;
		System.out.println("c = " + c);
		
		double result = a + a * b % c - a / b;
		
		/* 1. a * b = 350.0
		 * 2. 350 % c = 26.0
		 * 3. a / b = 3.5
		 * 4. a + 26.0 - 3.5 = 57.5
		 */

	}
	
	public void method3() {
		int a = 5;
		int b = 10;
		int c = (++a) + b; // a = 6, b = 10, c = 16
		int d = c / a; // d = 2
		int e = c % a; // e = 4
		int f = e++; // f = 4, e = 5
		int g = (--b) + (d--); // b = 9, d = 2(1) g = 11
		int h = 2; 
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		// 1. a++ = 6(7)
		// 2. --c / f = 3
		// c = 15
		// 3. g-- - d = 10
		// g = 11(10)
		// 4. ++e + h = 8
		// e = 6
		// 5. b / 3 = 3
		// 6. 3 * 10 = 30
		// 7. 30 % 8 = 6
		// 8. 6 + 6 = 12
		
		System.out.println("a : " + a);  
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		System.out.println("g : " + g);
		System.out.println("h : " + h);
		System.out.println("i : " + i);

	}

}
