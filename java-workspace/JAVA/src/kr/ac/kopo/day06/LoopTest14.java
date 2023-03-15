package kr.ac.kopo.day06;

public class LoopTest14 {

	public static void main(String[] args) {
		
		int star = 0;
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i+star; j++) {
				System.out.print("*");
			}
			for(int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			
			System.out.println();
			star++;
		}

	}

}
