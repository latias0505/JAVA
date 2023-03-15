package kr.ac.kopo.day06Homework;

import java.util.Scanner;

public class HomeworkMain07 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작단을 입력해주세요 : ");
		int num = sc.nextInt();
		
		System.out.println("종료단을 입력해주세요 : ");
		int num2 = sc.nextInt();
		
		if(num <= num2) {
			for(int j = num; j <= num2; j++) {
				System.out.println();
				System.out.println("[" + j + "단" + "]");
				for(int i = 1; i <= 9; i++) {
					System.out.println(j + "x" + i + "=" + (i*j));
				}
			
			}
		} else {
			for(int j = num2; j <= num; j++) {
				System.out.println();
				System.out.println("[" + j + "단" + "]");
				for(int i = 1; i <= 9; i++) {
					System.out.println(j + "x" + i + "=" + (i*j));
				}
			
			}
		}

	}

}
