package com.hw1.model.vo;

public class RollerCoaster {
	
	private static double CUTHEIGHT = 110;
	private static int PRICE;
	private static int PERMITNUMBER = 2;
	
	public RollerCoaster() {
		// TODO Auto-generated constructor stub
	}
	
	

	public static double getCUTHEIGHT() {
		return CUTHEIGHT;
	}



	public static void setCUTHEIGHT(double cUTHEIGHT) {
		CUTHEIGHT = cUTHEIGHT;
	}



	public static int getPRICE() {
		return PRICE;
	}



	public static void setPRICE(int pRICE) {
		PRICE = pRICE;
	}



	public static int getPERMITNUMBER() {
		return PERMITNUMBER;
	}



	public static void setPERMITNUMBER(int pERMITNUMBER) {
		PERMITNUMBER = pERMITNUMBER;
	}



	@Override
	public String toString() {
		return "RollerCoaster [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	

}
