package kr.ac.kopo.day06;

public class ExamMain04 {

	public static void main(String[] args) {
		
		int k = 0;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j <= k || j >= 10-k){
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			if(i < 5) {
				k++;
			} else {
				k--;
			}
		}

	}

}
