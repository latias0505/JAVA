package kr.ac.kopo.day08Homework;

import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][] arr = new int[10][20];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("정수를 입력해주세요. 0을 입력하면 정수입력을 취소합니다. : ");
			int num1 = sc.nextInt();
			if(num1 == 0) {
				 System.out.println("입력을 종료합니다.");
				 break;
			 }
			arr[i][0] = num1;
			
			int num2 = 1;
			for(int j = 1; j <= num1; j++) {
				if(num1 % j == 0) {
					arr[i][num2] = j;
					++num2;
				}
				
			}
			
		}
		for(int []arr2 : arr) {
			if(arr2[0] > 0) {
				System.out.print(arr2[0] + "의 약수 : ");
				for(int k = 1; k < arr2.length; k++) {
					if(arr2[k] != 0) {
						System.out.print(arr2[k] + " ");
					}
				}
				System.out.println();
			}
			
		}

	}

}
