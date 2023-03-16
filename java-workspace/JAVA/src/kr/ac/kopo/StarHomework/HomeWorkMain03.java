package kr.ac.kopo.StarHomework;

import java.util.Scanner;

public class HomeWorkMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 숫자 입력 : ");
		int num = sc.nextInt();
		
		for(int star1 = 0; star1 <= (num*2)-2; ++star1) {
			
			if(star1 < num) {
				for(int star2 = 1; star2 <= num-star1; ++star2) {
					System.out.print("*");
				}
			} else {	
				for(int star3 = -1; star3 <= star1-num; ++star3) {
						System.out.print("*");
					}
				}
			System.out.println();
		}

	}

}
