package kr.ac.kopo.day04;

import java.util.Scanner; //컨트롤 + 쉬프트 + 영어O 누르면 자동으로 import 

public class ScannerMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 : ");
		int num01 = sc.nextInt(); // sc.nextInt();로 정수값을 입력받아 num01에 저장
		
		System.out.print("두번째 정수 : ");
		int num02 = sc.nextInt();
		
		System.out.printf("%d는 %d의 배수여부 : %s", num01, num02, num01 % num02 == 0 ? "배수다" : "배수가 아니다");

	}

}
