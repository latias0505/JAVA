package kr.ac.kopo.day06;

public class ExamMain02 {									 //꼭 이 표를 만들어서 계산할 것
															 // i ㅣ " " ㅣ "*"
	public static void main(String[] args) {				 // ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
															 // 1 ㅣ  0  ㅣ  5 " " = i-1, "*" = 6-i 
		for(int i = 1; i <= 9; i++) {						 // 2 ㅣ  1  ㅣ  	4 
															 // 3 ㅣ  2  ㅣ  3
			if(i <= 5) {									 // 4 ㅣ  3  ㅣ  2
															 // 5 ㅣ  4  ㅣ  1
				for(int j = 1; j <= i-1; j++) {				 // 6 ㅣ  3  ㅣ  2 " " = 9-i, "*" = i-4
				System.out.print(" ");						 // 7 ㅣ  2  ㅣ  3
				}											 // 8 ㅣ  1  ㅣ  4
															 // 9 ㅣ  0  ㅣ  5
				for(int j = 1; j <= 6-i; j++) {
				System.out.print("*");
				}
			} else {
				for(int j = 1; j<= 9-i; j++) {
				System.out.print(" ");
				}
				for(int j = 1; j <= i-4; j++) {
				System.out.print("*");
				}
			}
			
			System.out.println();
		}

	}

}
