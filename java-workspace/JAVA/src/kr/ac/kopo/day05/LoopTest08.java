package kr.ac.kopo.day05;

public class LoopTest08 {

	public static void main(String[] args) {
		
		
		for(int star1 = 1; star1 <= 5; ++star1) {
			
			for(int star2 = 1; star2 <= 5; ++star2) {
				if(star2 < star1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		
		/*
		for(int star1 = 1; star1 <= 5; ++star1) {
			
			for(int star2 = 1; star2 <= star1-1; ++star2) {
				System.out.print(" ");
			}
			
			for(int star3 = 1; star3 <= 6-star1; ++star3) {
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		*/
	}

}
