package kr.ac.kopo.StarHomework;

import java.util.Scanner;

public class HomeWorkMain05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 숫자 입력 : ");
		int num = sc.nextInt();
		
		int star = num;
		for(int i = 1; i <= num*2; i++) {
			
			for(int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= star; j++) {

				System.out.print("*");
			}
			for(int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			System.out.println();
			star -= 2;
		}
		
	}

}
