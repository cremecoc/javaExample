package com.uni.chap01_before_vs_after.before.model.vo;

public class SmartPhone {
	private String brand;//브랜드
	private String pCode;//상품번호
	private String pName;//상품명
	private int price;//가격
	private String tss; // 통신사
	
	public SmartPhone() {
		
	}

	public SmartPhone(String brand, String pCode, String pName, int price, String tss) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.tss = tss;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

	public String getTss() {
		return tss;
	}

	public void setTss(String tss) {
		this.tss = tss;
	}

	@Override
	public String toString() {
		return "SmartPhone [brand=" + brand + ", pCode=" + pCode + ", pName=" + pName + ", price=" + price + ", tss= " + tss;
	}
	
	
}
