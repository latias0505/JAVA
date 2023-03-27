package kr.ac.kopo.day14;

public class Circle extends Figure {
	
	private int radius;

	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
		
		double area = radius * radius * Math.PI;
	}
	
	@Override
	public void printArea() {
		
		System.out.println("반지름 " + radius + "원의 넓이 : " + getArea());
		
	}

}
