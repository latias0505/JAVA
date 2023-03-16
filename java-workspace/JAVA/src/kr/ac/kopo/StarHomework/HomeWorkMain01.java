package kr.ac.kopo.StarHomework;

import java.util.Scanner;

public class HomeWorkMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 숫자 입력 : ");
		int num = sc.nextInt();
		
		for(int cmt = 1; cmt <= num; ++cmt) {
			
			for(int star = cmt; star <= num; ++star) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
