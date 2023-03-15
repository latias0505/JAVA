package kr.ac.kopo.day06;

public class LoopTest15 {

	public static void main(String[] args) {
		
		int star = 10;
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= star-i; j++) {
				System.out.print("*");
			}
			for(int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			System.out.println();
			star--;
		}
	}

}
