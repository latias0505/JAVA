package kr.ac.kopo.StarHomework;

import java.util.Scanner;

public class HomeWorkMain06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 숫자 입력 : ");
		int num = sc.nextInt();
		
		int star = num;
		int star1 = 0;
		for(int i = 1; num % 2 == 0 ? i <= num-1 : i <= num; i++) {
			
			if(i <= num/2) {
				for(int j =1; j <= i; j++) {
					System.out.print("*");
				}
				for(int j =1; j <= star-i-1; j++) {
					System.out.print("-");
				}
				if(i < num/2) {
					for(int j = 0; j <= i-1; j++) {
						System.out.print("*");
					}
				} else {
					for(int j = 0; j <= i-1; j++) {
						System.out.print("*");
					}
				}
				star--;
			} else {
				
				if(num % 2 == 0) { //짝수를 입력했을 때
					for(int j =1; j <= num-i; j++) {
					System.out.print("*");
					}
					for(int j = -2; j < star1; j += 1) {
						System.out.print("-");
					}
					for(int j = 1; j <= num-i ; j++) {
						System.out.print("*");
					}
				} else { // 홀수를 입력했을 때 
					for(int j =0; j <= num-i; j++) {
						System.out.print("*");
						}
					for(int j = 2; j <= star1; j += 1) {
						System.out.print("-");
					}
					for(int j = 1; j > num/2 ? j <= num-i : j <= num-i+1; j++) {
						System.out.print("*");
					}
				}
				if(star1 < num) {
					star1 += 2;
				}
				
				
			}
			
			System.out.println();
		}

	}

}
