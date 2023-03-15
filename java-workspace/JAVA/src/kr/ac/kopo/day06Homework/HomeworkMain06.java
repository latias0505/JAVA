package kr.ac.kopo.day06Homework;

import java.util.Scanner;

public class HomeworkMain06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2~9단 중 원하는 단을 입력하시오 : ");
		int num = sc.nextInt();
		
		for(int j = num; j <= num; j++) {
			System.out.println();
			System.out.println("[" + j + "단" + "]");
			for(int i = 1; i <= 9; i++) {
				System.out.println(j + "x" + i + "=" + (i*j));
			}
			
		}

	}

}
