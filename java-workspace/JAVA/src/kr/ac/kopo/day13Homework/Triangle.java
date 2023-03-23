package kr.ac.kopo.day13Homework;

import java.util.Scanner;

public class Triangle extends Printer {

	@Override             
	public void print() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("밑변의 길이를 입력하세요 : ");
		double num1 = sc.nextInt();
		System.out.println("높이의 길이를 입력하세요 : ");
		double num2 = sc.nextInt();
		
		System.out.println("밑변의 길이가 " + num1 + "높이의 길이가 " + num2 + "인 삼각형의 넓이는 " + (num1*num2)/2 + "입니다.");
		
	}
	
}
