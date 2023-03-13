package kr.ac.kopo.day05;

public class LoopTest06 {

	public static void main(String[] args) {
		
		for(int cmt = 5; cmt >= 1; --cmt) {
			
			for(int star = cmt; star <=5; ++star) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
