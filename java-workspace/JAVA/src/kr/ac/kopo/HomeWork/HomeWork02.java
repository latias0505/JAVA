package kr.ac.kopo.HomeWork;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구입하려는 물건값을 입력해주세요 : ");
		int money1 = sc.nextInt();
		
		System.out.print("지불할 금액을 입력해주세요 : ");
		int money2 = sc.nextInt();
		
		int money3 = money2 - money1;
		
		if(money3 < 0) {
			System.out.println("물건 값 : " + money1 + "원");
			System.out.println("지불한 금액 : " + money2 + "원");
			System.out.println(money3 + "원이 부족합니다.");
		} else if(money3 > 0) {
			System.out.println("물건 값 : " + money1 + "원");
			System.out.println("지불한 금액 : " + money2 + "원");
			System.out.println("거스름돈 : " + money3 + "원");
			System.out.println("1000원 : " + money3 / 1000 + "개");
			money3 = money3 % 1000;
			System.out.println("500원 : " + money3 / 500 + "개");
			money3 = money3 % 500;
			System.out.println("100원 : " + money3 / 100 + "개");
			money3 = money3 % 100;
			System.out.println("50원 : " + money3 / 50 + "개");
			money3 = money3 % 50;
			System.out.println("10원 : " + money3 / 10 + "개");
			money3 = money3 % 10;
			
		}

	}

}
