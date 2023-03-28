package kr.ac.kopo.day15Homework; 

import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK);
//		String[] dayArr = {"", "일", "월", "화", "수", "목", "금", "토"};
		int [] dayArr = {0, 1, 2, 3, 4, 5, 6, 7};
		
		int num = 0;
		int num4 = 1;
		int num5 = 1;
		int num7 = 0;
		
		for(int i = 0; i <= num; i++) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("원하는 항목을 선택하세요 (1.특정 년도 2.특정 월 3.종료) : ");
			int num1 = sc.nextInt();
			
			if(num1 == 1) {
				
				System.out.print("년도를 입력하세요 : ");
				int num2 = sc.nextInt();
				num7 = num2;
				for(int j = 0; j <= 11; j++) {
					System.out.println();
					System.out.println("<" + num2 + "년 " + (j+1) + "월>\n");
					System.out.println("일\t" + "월\t" + "화\t" + "수\t" + "목\t" + "금\t" + "토");
					c.set(num2, j, num4);
					day = c.get(Calendar.DAY_OF_WEEK);
					int num6 = c.getActualMaximum(Calendar.DAY_OF_MONTH);
					System.out.println();
					
					for(int k = 1; k <=1; k++) {
						num4 = k;
						for(int l = 1; l <= num6; l++) {
							if(day > l) {
								System.out.print("\t");
								num6++;
							} else {
								System.out.print(num5 + "\t");
								num5++;
								if(l % 7 == 0) {
									System.out.println();
								}
							}
								
						}
						num5 = 1;
						System.out.println();
					}
				}
				
				num++;
				
			} else if(num1 == 2) {
				
				System.out.println("월을 입력하세요 : ");
				int num3 = sc.nextInt();
				for(int j = num3-1; j <= 11; j++) {
					System.out.println();
					System.out.println("<" + num7 + "년 " + (j+1) + "월>\n");
					System.out.println("일\t" + "월\t" + "화\t" + "수\t" + "목\t" + "금\t" + "토");
					c.set(num7, j, num4);
					day = c.get(Calendar.DAY_OF_WEEK);
					int num6 = c.getActualMaximum(Calendar.DAY_OF_MONTH);
					System.out.println();
					
					for(int k = 1; k <=1; k++) {
						num4 = k;
						for(int l = 1; l <= num6; l++) {
							if(day > l) {
								System.out.print("\t");
								num6++;
							} else {
								System.out.print(num5 + "\t");
								num5++;
								if(l % 7 == 0) {
									System.out.println();
								}
							}
								
						}
						num5 = 1;
						System.out.println();
					}
				}
				
				num++;
				
			} else if(num1 == 3) {
				System.out.println("프로그램을 정지합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				num++;
			}
			
		}

	}

}
