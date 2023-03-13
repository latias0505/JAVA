package kr.ac.kopo.day05;

public class LoopTest10 {

	public static void main(String[] args) {
		
		for(int star1 = 1; star1 <= 9; ++star1) {
			
			if(star1 <= 5) {
				for(int star2 = 1; star2 <= star1; ++star2) {
					System.out.print("*");
				}
			} else {
				for(int star3 = 4; star3 >= star1-5; --star3) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
