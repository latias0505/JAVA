package kr.ac.kopo.day13Homework;

import java.util.Scanner;

public class Rectangle extends Printer {

	@Override             
	public void print() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로의 길이를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.println("세로의 길이를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("가로의 길이가 " + num1 + "세로의 길이가 " + num2 + "인 직사각형의 넓이는 " + num1*num2 + "입니다.");
		
	}
	
}
