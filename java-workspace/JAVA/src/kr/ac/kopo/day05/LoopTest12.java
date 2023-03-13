package kr.ac.kopo.day05;

public class LoopTest12 {

	public static void main(String[] args) {
		
		for(int star1 = 1; star1 <= 9; ++star1) {
				
				if(star1 <= 5) {
					for(int star2 = 2; star2 <= star1; ++star2) {
					System.out.print(" ");
					}
					for(int star3 = 5; star3 >= star1; --star3) {
						System.out.print("*");
					}
				} else {
					for(int star4 = 4; star4 >= star1 - 4; --star4) {
						System.out.print(" ");
					}
					for(int star5 = 1; star5 <= star1 - 4; ++star5) {
						System.out.print("*");
					}
				}	
				System.out.println();
		}

	}

}
