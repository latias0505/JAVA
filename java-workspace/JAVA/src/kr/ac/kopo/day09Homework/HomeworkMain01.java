package kr.ac.kopo.day09Homework;

import java.util.Random;
import java.util.Scanner;

public class HomeworkMain01 {
	

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int random = r.nextInt(100);
		
		Scanner sc = new Scanner(System.in);
		
		int min = 0, max = 100, robot = random + 1;
		
		for(int i = 1; i <= 6; i++) {
		System.out.print(min + "~" + max + " 사이의 수를 입력해주세요 : ");
		int num1 = sc.nextInt();
		if(num1 < min || num1 > max) {
			System.out.println("잘못 입력하셨습니다.");
			i--;
		}
			if(num1 == robot) {
				System.out.println("축하합니다. 정답입니다.");
				break;
			} else if(num1 > robot && i < 6 && num1 > min && num1 < max) {
				System.out.println(num1 + "보다 작은 수 입니다.");
				System.out.println("기회는" + (6-i) + "번 남았습니다.");
				max = num1 - 1;
			} else if(num1 < robot && i < 6 && num1 > min && num1 < max) {
				System.out.println(num1 + "보다 큰 수 입니다.");
				System.out.println("기회는" + (6-i) + "번 남았습니다.");
				min = num1 + 1;
			} else if(i == 6 && num1 > min && num1 < max) {
				System.out.println("기회는" + (6-i) + "번 남았습니다.");
				System.out.println("아쉽습니다. 기회를 전부 소진하셨습니다.");
				System.out.println("정답은" + "[" + robot + "]" + "입니다.");
			}
			System.out.println();
		}
		

	}

}
