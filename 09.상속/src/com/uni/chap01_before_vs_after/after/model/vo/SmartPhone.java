package com.uni.chap01_before_vs_after.after.model.vo;

public class SmartPhone extends Product {

	private String mobileAgency;
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand, pCode, pName, price);
		
		this.mobileAgency = mobileAgency;
		// TODO Auto-generated constructor stub
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	@Override
	public String toString() {
		return "SmartPhone [mobileAgency=" + mobileAgency + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
}
