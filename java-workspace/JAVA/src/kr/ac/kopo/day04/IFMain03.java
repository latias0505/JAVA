package kr.ac.kopo.day04;

import java.util.Scanner;

public class IFMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보유하고 있는 책권수 : ");
		int book = sc.nextInt();
		
		if(book == 0) {
			System.out.println("보유하고 있는 책 없음");
		} else if(book == 1) { //else가 나오고 나서 if가 나왔을 때 직관적으로 if문 해석이 가능하다면 종속되지 않고 이어서 작성 가능
				System.out.println(book + "book");
		} else {
				System.out.println(book + "books");
		}
	}

}
