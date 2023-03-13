package kr.ac.kopo.day05;

public class LoopTest13 {

	public static void main(String[] args) {

		for(int star1 = 1; star1 <= 9; ++star1) {
			if(star1 <= 5) {
				for(int star2 = 4; star2 >= star1; --star2) {
					System.out.print("-");
				}
				for(int star3 = 1; star3 <= star1; ++star3) {
					System.out.print("*");
				}
			}else {
				for(int star4 = 6; star4 <= star1; ++star4) {
					System.out.print("-");
				}
				for(int star5 = 7; star5 >= star1-2; --star5) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
