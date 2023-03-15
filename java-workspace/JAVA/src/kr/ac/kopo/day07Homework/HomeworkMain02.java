package kr.ac.kopo.day07Homework;

import java.util.Scanner;

public class HomeworkMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] ar = new int[5];
		
		for(int i = 0; i < ar.length; i++) {
			
			System.out.print("0~99 사이의 숫자를 입력해주세요 : ");
			
			 ar[i] = sc.nextInt(); 
			 if(ar[i] >= 99 || ar[i] <= 0) {
				 System.out.println("다시 입력해주세요");
				 i --;
			 }
			
		}
		System.out.println();
		System.out.println(" <입력받은정수> ");
		for(int i = 0; i < ar.length; i++) {
			System.out.println("num" + (i+1) + " : " + ar[i]);
		}
		System.out.println();
		System.out.println(" <PRINT> ");
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		System.out.println("\n" + " <REVERSE> ");
		for(int i = ar.length-1; 0 <= i; --i) {
			int num1 = ar[i] / 10;
			int num2 = ar[i] % 10;
				System.out.print(num2 + "" +  num1 + " ");
		}

	}

}
