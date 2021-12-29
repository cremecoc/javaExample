package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		Animal[] aniArr = new Animal[5];
		
		aniArr[0] = new Dog("강아지", "비숑", 8);
		aniArr[1] = new Cat("치즈", "모름", "집", "노란색");
		aniArr[2] = new Dog("두부", "말티즈", 7);
		aniArr[3] = new Cat("나비", "모름", "집", "검정색");
		aniArr[4] = new Dog("감자", "비숑", 10);
		
		for(int i = 0; i < aniArr.length; i++) {
			aniArr[i].speak();
		}
		

	}

}
