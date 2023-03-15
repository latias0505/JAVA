package kr.ac.kopo.day06Homework;

public class HomeworkMain08 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 3; i++) {
			int num = 4;
			int num1 = 2;
			if(i == 2) {
				num += 3;
				num1 += 3;
			}else if(i == 3) {
				num += 5;
				num1 += 6;
			}
			for(int j = 1; j <=9; j++) {
				for(int k = num1; k <= num; k++) {
					if(k <= 4) {
					System.out.print(k + "x" + j + "=" + j*k + " ");
					} else if(num <= 7 && k > 4){
						System.out.print(k + "x" + j + "=" + j*k + " ");
					} else {
						System.out.print(k + "x" + j + "=" + j*k + " ");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
