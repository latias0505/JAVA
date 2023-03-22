package kr.ac.kopo.day12Homework;

public class Square {
	
	int side;
	
	Square() {
		
	}
	
	Square(int side) {
		this.side = side;
	}
	
	public void info() {
			
		System.out.println("가로 " + side + ", 세로 " + side + "의 정사각형의 넓이는 " + side*side + "입니다.");
	}

}
