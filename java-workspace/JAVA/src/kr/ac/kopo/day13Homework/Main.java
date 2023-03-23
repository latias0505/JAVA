package kr.ac.kopo.day13Homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("< 계산할 수 있는 도형 종류 >");
		System.out.println("1.정사각형 2.직사각형 3.삼각형 4.원");
		System.out.println();
		
		System.out.print("면적을 구할 도형을 선택하세요 : ");
		int num = sc.nextInt();
		
		Printer p = null;
		switch(num) {
		case 1:
			p = new Square();
			break;
		case 2:
			p = new Rectangle();
			break;
		case 3:
			p = new Triangle();
			break;
		case 4:
			p = new Circle();
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
		
		}
		 if(p != null) {
				p.print();
			  }

	}

}
