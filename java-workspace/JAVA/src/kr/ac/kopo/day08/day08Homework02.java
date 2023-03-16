package kr.ac.kopo.day08;

public class day08Homework02 {

	public static void main(String[] args) {
		
		int step = 3;
		
		for(int i = 2; i <= 9; i += step) {
			for(int j = 1; j <= 9; j++) {
				for(int k = i; k <= 9 && k <= i+2; k++) {
					if(j == 0) {
						System.out.print( "***" + k + "단" + "***");
					}
				System.out.printf("%d * %d = %d\t", k, j, k*j);
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
