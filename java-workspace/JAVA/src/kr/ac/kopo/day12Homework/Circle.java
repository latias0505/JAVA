package kr.ac.kopo.day12Homework;

public class Circle {
	
	int side;
	
	Circle() {
		
	}
	
	Circle(int side) {
		this.side = side;
	}
	
	public void info() {
			
		System.out.println("반지름 " + side + "의 정사각형의 넓이는 " + (side*side)*3.14 + "입니다.");
	}

}
