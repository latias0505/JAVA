package kr.ac.kopo.HomeWork;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력해주세요 : ");
		int no = sc.nextInt();
		
		double num1 = 3.1415926535;
		double num2 = no * no * num1;
		double num3 = no * 2 * num1;
		
		System.out.printf("%s %d %s %s %.4f %s %.4f", "반지름 : ", no, " => ", "원 넓이 : ", num2, " 원 둘레 : ", num3);
	}

}
