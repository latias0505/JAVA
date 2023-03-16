package kr.ac.kopo.day08;

import java.util.Scanner;

public class day08Homework04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		
		for(int i = 0; i < nums.length;) { //증감문 생략 후 하단 조건문에 증감문 작성
			System.out.printf("num %d : ", i+1);
			nums[i] = sc.nextInt();
			if(nums[i] >= 0 && nums[i] <= 99) {
				i++;
			}
		}
		
		System.out.println("< PRINT >");
		for(int num : nums) {
			System.out.print(num + "\t");
		}
		System.out.println();

	}

}
