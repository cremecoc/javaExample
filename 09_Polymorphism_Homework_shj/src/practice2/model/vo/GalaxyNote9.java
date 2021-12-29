package practice2.model.vo;

public class GalaxyNote9 extends SmartPhone {
	
	public GalaxyNote9() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void charge() {
		super.charge();
		System.out.println(", 고속 무선 충전");
		
	}

	@Override
	public void makeaCall() {
		super.makeaCall();
		
	}

	@Override
	public void takeaCall() {
		super.takeaCall();
		
	}

	@Override
	public void picture() {
		System.out.println("1300만 듀얼카메라");
		
	}

	@Override
	public void touch() {
		super.touch();
		System.out.println(", 와콤펜 지원");
		
	}

	@Override
	public void printMaker() {
		System.out.print("갤럭시 노트9는 삼성");
		super.printMaker();
	}
	
	
	
	

}
