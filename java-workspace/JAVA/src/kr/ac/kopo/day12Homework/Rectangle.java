package kr.ac.kopo.day12Homework;

public class Rectangle {

int side1;
int side2;
	
	Rectangle() {
		
	}
	
	Rectangle(int side1, int side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public void info() {
			
		System.out.println("가로 " + side1 + ", 세로 " + side2 + "의 직사각형의 넓이는 " + side1*side2 + "입니다.");
	}
	
}
