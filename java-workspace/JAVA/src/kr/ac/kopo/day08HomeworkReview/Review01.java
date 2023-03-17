package kr.ac.kopo.day08HomeworkReview;

import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {
		
		int[][] numArr = new int[10][20]; //최대 10번지까지 있고 한 번지당 20개까지 누적할 수 있음을 나타냄
		int loc = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요. 최대 10개 입력, 0 입력시 종료됩니다.");
		
//		while(true) {
//		numArr[loc++][0] = sc.nextInt(); //입력받은 값을 loc에 직접 넣고 while문이 돌때마다 loc++로 저장 공간이 0번지부터 1번지씩 늘어남
//		if(numArr[loc][0] == 0) {
//			break;
//		}
//		if(++loc == numArr.length) {
//			break;
//		}
//		}
		do {
			numArr[loc][0] = sc.nextInt(); //입력값을 입력받아 loc변수 0분지에 입력
			
			int j = 1;
			for(int i = 1; i <= numArr[loc][0]; i++) { 
				if(numArr[loc][0] % i == 0) { //0번지에 입력된 값을 i로 나눠서 0으로 떨어지는지를 파악하여 약수를 구하는 과정
					numArr[loc][j++] = i;  
				}	// 0으로 떨어지는 수를 약수로 판단하여 1번지부터 j++로 for문이 반복될동안 번지를 1씩 늘리며 약수를 저장
			}
			
			numArr[loc][0] = j-1; // 약수가 입력된 공간의 최대 번지의 번호를 나타내는 j값에서 -1 한 숫자를 loc에 덮어씌움
			
		}while(numArr[loc][0] != 0 && ++loc < 10);
		
		for(int i = 0; i < loc; i++) {
			int idx = numArr[i][0]; //idx에 i번지의 0번째 값을 저장
			System.out.print(numArr[i][idx] + "의 약수 : "); // i번째 번지에 저장된 idx값을 출력
			for(int j = 0; j <= idx; j++) //for문에 {}가 없으면 for문 바로 다음에 오는 한줄만 반복한다는 의미
				System.out.print(numArr[i][j] + " "); //i번지에 저장된 j번째의 값을 출력함
			System.out.println();
			
		}

	}

}
