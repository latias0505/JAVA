package kr.ac.kopo.day07Homework;

import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] ar = new int[10];
		
		for(int i = 0; i < ar.length; i++) {
			
			System.out.print(i+1 + "번째 정수 : ");
			 ar[i] = sc.nextInt();
		}
		
		System.out.println(" <입력받은정수> ");
		for(int i = 0; i < ar.length; i++) {
			System.out.println("num" + (i+1) + " : " + ar[i]);
		}
		System.out.println();
		System.out.println("<짝수>");
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] % 2 == 0) {
				System.out.print(ar[i] + " ");
			}
		}
		System.out.println();
		System.out.println("<홀수>");
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] % 2 != 0) {
				System.out.print(ar[i] + " ");
			}
		}
		
		
	}

}
