package kr.ac.kopo.StarHomework;

import java.util.Scanner;

public class HomeWorkMain04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 숫자 입력 : ");
		int num = sc.nextInt();
		
		for(int star1 = 1; star1 <= (num*2)-1; ++star1) {
			if(star1 <= num) {
				for(int star2 = num-1; star2 >= star1; --star2) {
					System.out.print(" ");
				}
				for(int star3 = 1; star3 <= star1; ++star3) {
					System.out.print("*");
				}
			}else {
				for(int star4 = num-1; star4 <= star1-2; ++star4) {
					System.out.print(" ");
				}
				for(int star5 = (num*2)-3; star5 >= star1-2; --star5) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
