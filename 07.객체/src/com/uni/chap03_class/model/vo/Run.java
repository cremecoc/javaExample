package com.uni.chap03_class.model.vo;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product();
		p1.setpName("갤럭시");
		p1.setPrice(100000);
		p1.setBrand("삼성");
		
		Product p2 = new Product();
		p2.setpName("아이폰");
		p2.setPrice(200000);
		p2.setBrand("애플");
		
		System.out.println(p1.information());
		System.out.println(p2.information());
		
		DftProduct d = new DftProduct();

	}

}
