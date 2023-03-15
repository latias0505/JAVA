package kr.ac.kopo.day06;

public class LoopTest16 {

	public static void main(String[] args) {

		int star = 10;
		int star1 = 3;
		
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 1; j <= i-1; j++) {
					System.out.print(" ");
				}
				for(int j = 1; j <= star-i; j++) {
					System.out.print("*");
				}
				for(int j = 1; j <= i-1; j++) {
					System.out.print(" ");
				}
				star--;
			} else {
				for(int j = 1; j <= 9-i; j++) {
					System.out.print(" ");
				}
				for(int j = 1; j <= i-star1; j++) {
					System.out.print("*");
				}
				for(int j = 1; j <= 9-i; j++) {
					System.out.print(" ");
				}
				star1--;
			}
			System.out.println();
		}

	}

}
