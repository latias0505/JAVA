package kr.ac.kopo.HomeWork;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력해주세요 : ");
		int no1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력해주세요 : ");
		int no2 = sc.nextInt();
		
		System.out.print("세번째 정수를 입력해주세요 : ");
		int no3 = sc.nextInt();
		
		int num1;
		int num2;
		int num3;
		
		if(no1 > no2 && no1> no3 && no2 > no3) {
			num1 = no3;
			num2 = no2;
			num3 = no1;
		} else if(no1 > no2 && no1 > no3 && no3 > no2) {
			num1 = no2;
			num2 = no3;
			num3 = no1;
		} else if(no2 > no1 && no2 > no3 && no1 > no3) {
			num1 = no3;
			num2 = no1;
			num3 = no2;
		} else if(no2 > no1 && no2 > no3 && no3 > no1) {
			num1 = no1;
			num2 = no3;
			num3 = no2;
		} else if(no3 > no1 && no3 > no2 && no1 > no2) {
			num1 = no2;
			num2 = no1;
			num3 = no3;
		}  else {
			num1 = no1;
			num2 = no2;
			num3 = no3;
		}
		
	System.out.println("입력받은 숫자를 크기 순서대로 나열합니다." + " " + num1 + " " + num2 + " " + num3);

	}

}
