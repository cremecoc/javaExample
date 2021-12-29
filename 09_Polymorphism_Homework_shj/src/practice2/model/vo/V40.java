package practice2.model.vo;

public class V40 extends SmartPhone {
	
	public V40() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void makeaCall() {
		// TODO Auto-generated method stub
		super.makeaCall();
	}



	@Override
	public void takeaCall() {
		// TODO Auto-generated method stub
		super.takeaCall();
	}



	@Override
	public void touch() {
		super.touch();
		System.out.println();
		
	}



	@Override
	public void charge() {
		super.charge();
		System.out.println();
		
	}

	

	@Override
	public void picture() {
		System.out.println("1200, 1600만 화소 트리플 카메라");
		
	}


	@Override
	public void printMaker() {
		System.out.print("V40은 LG");
		super.printMaker();
	}
	
	
	
	

}
