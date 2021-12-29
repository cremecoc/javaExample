package practice2.run;

import practice2.model.vo.GalaxyNote9;
import practice2.model.vo.SmartPhone;
import practice2.model.vo.V40;

public class Run {

	public static void main(String[] args) {
		
		SmartPhone[] smt = new SmartPhone[2];
		
		smt[0] = new GalaxyNote9();
		smt[1] = new V40();
		
		for(int i = 0; i < smt.length; i++) {
			smt[i].printMaker();
			smt[i].makeaCall();
			smt[i].takeaCall();
			smt[i].touch();
			smt[i].charge();
			smt[i].picture();
			System.out.println();
		}

	}

}
