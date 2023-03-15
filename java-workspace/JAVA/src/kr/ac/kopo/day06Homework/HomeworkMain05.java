package kr.ac.kopo.day06Homework;

public class HomeworkMain05 {

	public static void main(String[] args) {
		
		for(int j = 2; j <= 9; j++) {
			if(j > 2) {
			System.out.println();
			}
			System.out.println("[" + j + "단" + "]");
			for(int i = 1; i <= 9; i++) {
				System.out.println(j + "x" + i + "=" + (i*j));
			}
			
		}

	}

}
