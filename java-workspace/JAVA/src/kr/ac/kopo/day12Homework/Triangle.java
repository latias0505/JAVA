package kr.ac.kopo.day12Homework;

public class Triangle {
	
	double side1;
	double side2;
	
	Triangle() {
		
	}
	
	Triangle(double side1, double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public void info() {
			
		System.out.println("밑변 " + side1 + ", 높이 " + side2 + "의 삼각형의 넓이는 " + (side1*side2)/2 + "입니다.");
	}

}
