package kr.ac.kopo.HomeWork;

import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력해주세요 : ");
		int no1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력해주세요 : ");
		int no2 = sc.nextInt();
		
		System.out.print("세번째 정수를 입력해주세요 : ");
		int no3 = sc.nextInt();
		
		System.out.print("네번째 정수를 입력해주세요 : ");
		int no4 = sc.nextInt();
		
		int num1;
		
		if(no1 > no2 && no1 > no3 && no1 > no4) {
			num1 = no1;
		} else if(no2 > no1 && no2 > no3 && no2 > no4) {
			num1 = no2;
		} else if(no3 > no1 && no3 > no2 && no3 > no4) {
			num1 = no3;
		} else {
			num1 = no4;
		}
		
		System.out.println("가장 큰 수를 말씀드리겠습니다." + " " + num1);

	}

}
