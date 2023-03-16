package kr.ac.kopo.StarHomework;

import java.util.Scanner;

public class HomeWorkMain02 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 숫자 입력 : ");
		int num = sc.nextInt();
		
		for(int star1 = 1; star1 <= num; ++star1) {
			
			for(int star2 = num; star2 >= 1; --star2) {
				if(star2 > star1) {
				System.out.print(" ");
			} else {
				System.out.print("*");
				}
			}
			
			System.out.println();
		}

	}

}
