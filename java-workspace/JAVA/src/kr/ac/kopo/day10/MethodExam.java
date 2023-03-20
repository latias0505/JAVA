package kr.ac.kopo.day10;

import java.util.Scanner;

public class MethodExam {

	/**
	 * 호출자 메소드에서 받아온 두개의 정수 사이의 총합을 반환하는 메소드
	 * @param num1 총합의 시작값
	 * @param num2 총합의 종료값
	 * @return num1~num2 사이의 총합
	 */
	int getTotal(int num1, int num2) {
		
		int total = 0;

		for(int i = num1; i <= num2; i++) {
			
			total += i;
		}
		
		return total;
	}
	
	/**
	 * 키보드로 단을 입력받아 반환
	 * @return
	 */
	int getDan() {
		
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		
		return dan;
	}
	
	/**
	 * 단을 이용하여 구구단을 출력
	 * @param dan
	 */
	void printGugudan(int dan) {
		
		System.out.println("*** " + dan + "단 ***");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " x " + i + " = " + (dan * i));
		}
		
	}
	
	/**
	 *  2~9단 전체 구구단 출력
	 */
	void printGugudan() {
		
		printGugudan(2, 9);
		
//		for(int dan = 2; dan <= 9; dan++) {
//			/*this.*/printGugudan(dan);
//		}
		/*
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("*** " + dan + "단 ***");
			for(int i = 1; i <=9; i++) {
				System.out.println(dan + " x " + i + " = " + dan *i);
			}
		}
		*/
	}
	/**
	 * 시작단 ~ 종료단 구구단 출력
	 * @param startDan
	 * @param endDan
	 */
	void printGugudan(int startDan, int endDan) {
		for(int dan = startDan; dan <= endDan; dan++) {
			printGugudan(dan);
		}
	}

}
