package kr.ac.kopo.day07Homework;

import java.util.Scanner;

public class HomeworkMain03 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		double num2 = 0;
		double num3 = 0;
		double num4 = 0;
		int[] ar = new int[5];
		
		for(int i = 0; i < ar.length; i++) {
			
			System.out.print(i+1 + "번째 학생 : ");
			 ar[i] = sc.nextInt();
			 
			 if(ar[i] <= 100 && ar[i] >= 0) {
			 num2 += ar[i];
			 }
			 
			 if(ar[i] <= 100 && ar[i] >= 0) {
			 num3 ++;
			 }
			 if(ar[i] <= 100 && ar[i] >= 0) {
				 num4 = num2/num3;
				 }
		}
		
		System.out.println(" <전체 성적표> ");
		System.out.println("순서" + " " + "성적" + " " + "학점");
		int num1 = 0;
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] >= 90 && ar[i] <= 100) {
				System.out.println(i+1 + "   " + ar[i] + "   A");
			} else if(ar[i] >= 80 && ar[i] < 90) {
				System.out.println(i+1 + "   " + ar[i] + "   B");
			} else if(ar[i] >= 70 && ar[i] < 80) {
				System.out.println(i+1 + "   " + ar[i] + "   C");
			} else if(ar[i] >= 60 && ar[i] < 70) {
				System.out.println(i+1 + "   " + ar[i] + "   D");
			} else if(ar[i] >= 0 && ar[i] < 60) {
				System.out.println(i+1 + "   " + ar[i] + "   F");
			} else {
				System.out.println(i+1 + "   " + "ERROR");
				num1 ++;
			}
			
		}
		if(num1 > 0) {
			System.out.println("5명 입력 중" + " " + num1 + "회 에러발생");
			}
		System.out.println("총점 : " + num2);
		System.out.println("평균 : " + num4);

	}

}
