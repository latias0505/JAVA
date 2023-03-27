package kr.ac.kopo.day14;

public abstract class Figure {
	
	private double area;
	
	public double getArea() {
		return this.area;
	}
	
	public void setAtea(double area) {
		this.area = area;
	}
	
	public abstract void printArea();

}
