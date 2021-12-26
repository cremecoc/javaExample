package com.uni.chap02_inherit.run;

import com.uni.chap02_inherit.model.vo.Airplane;
import com.uni.chap02_inherit.model.vo.Car;
import com.uni.chap02_inherit.model.vo.Ship;
import com.uni.chap02_inherit.model.vo.Vehicle;

public class Run {

	public static void main(String[] args) {
		Airplane a = new Airplane("비행기", 0.021, "제트기", 16, 5);
		Car c = new Car("벤틀리", 46, "sedan", 4);
		Ship s = new Ship("낚시배", 3, "어선", 1);
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(s);
		
		a.howToMove();
		c.howToMove();
		s.howToMove();
		
		// 다형성을 적용하고 for each로 howtoMove() 찍기
		
		Vehicle[] v1 = new Vehicle[3];
		v1[0] = a;
		v1[1] = c;
		v1[2] = s;
		
		for(Vehicle v : v1) {
			v.howToMove();
		}
	}

}
