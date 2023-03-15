package kr.ac.kopo.day07;

import java.util.Scanner;

public class ArrayMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] ar = new double[3];
		
		for(int i = 0; i < ar.length; i++) {
			
			System.out.print(i+1 + "번째 실수 : ");
			 ar[1] = sc.nextDouble();
		}
		
		System.out.println(" <index를 이용한 출력> ");
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "\t");
		}
		
		System.out.println(" <1.5버전의 for문을 이용한 출력> ");
		for( double data : ar) {
			System.out.print(data + "\t");
		}
		System.out.println();
	}

}
