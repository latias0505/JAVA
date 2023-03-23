package kr.ac.kopo.day13Homework;

import java.util.Scanner;

public class Circle extends Printer {

	@Override             
	public void print() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 길이를 입력해주세요. : ");
		double num1 = sc.nextInt();
		
		System.out.println("반지름의 길이가 " + num1 + "인 원의 넓이는 " + (num1*num1)*3.14 + "입니다.");
		
	}
	
}
