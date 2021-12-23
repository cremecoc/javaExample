package com.uni.variable;

// 오버플로우 실습
public class C_Overflow {
	
	public void printVariableSize() {
		
		System.out.println("byte의 크기: " + Byte.BYTES + "byte");
		System.out.println("byte의 크기: " + Byte.MAX_VALUE + "byte"); // byte 최대 크기 알아볼 수 있음
		System.out.println("short의 크기  : "+ Short.BYTES + "byte");
		System.out.println("int의 크기  : "+ Integer.BYTES + "byte");
		System.out.println("long의 크기  : "+ Long.BYTES + "byte");
		System.out.println("float의 크기  : "+ Float.BYTES + "byte");
		System.out.println("double의 크기  : "+ Double.BYTES + "byte");
		System.out.println("char의 크기  : "+ Character.BYTES + "byte");

	}
	
	public void overflow() {
		byte bNum = 127;
		System.out.println(bNum);
		
		byte result = (byte) (bNum + 3); // 127 + 1 = -128 // -128 + 1 = -127 // -127 + 1 = -126
		System.out.println("result: " + result); // -126
		
		int num1 = 1000000;
		int num2 = 700000;
		
		int result2 = num1 * num2; // int는 21억까지 가능
		System.out.println("result2: " + result2);
		
		long result3 = (long)num1 * num2; // 이미 곱셈 자체에서 int형으로 결과가 나오기 때문에 그 순간 이미 오버플로우 발생
										  // 둘 중 하나라도 long형으로 강제 변환을 시켜 줘야 된다
		System.out.println("result3: " + result3);
	}

}
