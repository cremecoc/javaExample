package com.uni.part01.object_vs_objectArr.run;

import com.uni.part01.object_vs_objectArr.model.vo.Product;

public class ObjectArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product[] arr = new Product[3];
		
		arr[0] = new Product("갤럭시", 1000, "삼성");
		arr[1] = new Product("갤럭시1", 2000, "삼성1");
		arr[2] = new Product("갤럭시2", 3000, "삼성2");
		
		for(Product p : arr) {
			System.out.println(p.information());
		}
	}

}
