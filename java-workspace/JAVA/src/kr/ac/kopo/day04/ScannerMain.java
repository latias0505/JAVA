package kr.ac.kopo.day04;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력 : ");
		char ch = sc.nextLine().charAt(0); //정수나 실수와는 다르게 문자형은 sc.nextLine().charAt(0); 형태를 꼭 써야함
		System.out.println("ch : " + ch);
		
		System.out.print("문자열을 입력 :");
//		String str = sc.next();
		String str = sc.nextLine();
		
		
		System.out.println("srt : " + str);
		
		System.out.println("정수를 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("num :" + num);
		
		System.out.println("실수를 입력 :");
		double num2 = sc.nextDouble();
		
		System.out.println("num2 : " + num2);

	}

}
