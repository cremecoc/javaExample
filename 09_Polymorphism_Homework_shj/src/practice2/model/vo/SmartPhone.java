package practice2.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay{

	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}
	
	public void printMaker() {
		System.out.println("에서 만들어졌다.");
	}

	@Override
	public void makeaCall() {
		System.out.println ("번호를 누르고 통화버튼을 누름");
		
	}

	@Override
	public void takeaCall() {
		System.out.println("전화받기 버튼을 누름");
		
	}

	@Override
	public void touch() {
		System.out.print("정전식");
		
	}

	@Override
	public void charge() {
		System.out.print("고속충전");
		
	}
	
	

	
	
	
}
