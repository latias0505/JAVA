package kr.ac.kopo.day12Homework;

import java.util.Scanner;

import kr.ac.kopo.day12Homework.Square;
import kr.ac.kopo.day12Homework.Rectangle;
import kr.ac.kopo.day12Homework.Triangle;
import kr.ac.kopo.day12Homework.Circle;

public class HomeworkMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("< 계산할 수 있는 도형 종류 >");
		System.out.println("1.정사각형 2.직사각형 3.삼각형 4.원");
		System.out.println();
		
		System.out.print("면적을 구할 도형을 선택하세요 : ");
		int num1 = sc.nextInt();
		if(num1 == 1) {
			System.out.println("한 변의 길이를 입력하세요 : ");
			int num2 = sc.nextInt();
			
			Square e = new Square(num2);
			
			e.info();
		} else if(num1 == 2) {
			System.out.println("가로의 길이를 입력하세요 : ");
			int num2 = sc.nextInt();
			System.out.println("세로의 길이를 입력하세요 : ");
			int num3 = sc.nextInt();
			
			Rectangle e = new Rectangle(num2, num3);
			
			e.info();
		} else if(num1 == 3) {
			System.out.println("밑변의 길이를 입력하세요 : ");
			int num2 = sc.nextInt();
			System.out.println("높이의 길이를 입력하세요 : ");
			int num3 = sc.nextInt();
			
			Triangle e = new Triangle(num2, num3);
			
			e.info();
		} else {
			System.out.println("반지름의 길이를 입력하세요 : ");
			int num2 = sc.nextInt();
			
			Circle e = new Circle(num2);
			
			e.info();
		}

	}

}
