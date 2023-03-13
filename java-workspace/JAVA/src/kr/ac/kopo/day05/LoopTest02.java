package kr.ac.kopo.day05;

public class LoopTest02 {

	public static void main(String[] args) {
	
		for(int cnt = 1; cnt <= 5; ++cnt) {
			
			if(cnt == 1) {
				for(int num1 = 1; num1 <= 5; ++num1) {
					System.out.print(1);
				}
			} else if(cnt == 2) {
				for(int num2 = 1; num2 <= 5; ++num2) {
					System.out.print(2);
				}
			} else if(cnt == 3) {
				for(int num3 = 1; num3 <= 5; ++num3) {
					System.out.print(3);
				}
			} else if(cnt == 4) {
				for(int num4 = 1; num4 <= 5; ++num4) {
					System.out.print(4);
				}
			} else {
				for(int num5 = 1; num5 <= 5; ++num5) {
					System.out.print(5);
				}
			}
			System.out.println();
			
		}

	}

}
