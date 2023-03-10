package kr.ac.kopo.HomeWork;

import java.util.Scanner;

public class HomeWork05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보유하고 있는 책의 권수를 입력해주세요 : ");
		int book = sc.nextInt();
		
		/*
		switch(book) {
		case 0 : 
			System.out.println("보유하고 있는 책 권수 : " + " " + book);
			System.out.println("보유하고 있는 책이 없습니다.");
			break;
		case 1 : 
			System.out.println("보유하고 있는 책 권수 : " + " " + book);
			System.out.println("1 book");
			break;
		case 2: 
			System.out.println("보유하고 있는 책 권수 : " + " " + book);
			System.out.println("2 books");
			break;
		default : 
			System.out.println("보유하고 있는 책 권수 : " + " " + book);
			System.out.println(book > 2 ? "보유하고 있는 책 권수 : " + book + " " + "books" : "책 권수를 잘못 입력하셨습니다.");
		}
		*/
		
		if(book == 0) {
			System.out.println("보유하고 있는 책 권수 : " + " " + book);
			System.out.println("보유하고 있는 책이 없습니다.");
		} else if(book == 1) {
			System.out.println("보유하고 있는 책 권수 : " + " " + book);
			System.out.println(book + "book");
		} else if(book > 1) {
			System.out.println("보유하고 있는 책 권수 : " + " " + book);
			System.out.println(book + "books");
		} else {
			System.out.println("보유하고 있는 책 권수 : " + " " + book);
			System.out.println("책 권수를 잘못 입력하셨습니다.");
		}
		
	}

}
