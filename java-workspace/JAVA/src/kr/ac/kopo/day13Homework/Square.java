package kr.ac.kopo.day13Homework;

import java.util.Scanner;

public class Square extends Printer {

	@Override             
	public void print() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 변의 길이를 입력해주세요. : ");
		double num1 = sc.nextInt();
		
		System.out.println("한 변의 길이가 " + num1 + "인 정사각형 넓이는 " + num1*num1 + "입니다.");
		
	}
	
}
