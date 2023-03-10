package kr.ac.kopo.day04;

import java.util.Scanner;

public class IFMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보유하고 있는 책권수 입력 : ");
		int book = sc.nextInt();
		
		System.out.println(book + (book == 1 ? "book" : "books"));
		
		if(book > 1) {
			System.out.println(book + "books");
		} else {
			System.out.println(book + "book");
		}
		
		/*
		if(book == 1) {
			System.out.println(book + "book");
		} else {
			System.out.println(book + "books");
		}
		
		/*
		System.out.println(book + "book");
		
		if(book != 1) {
			System.out.println("S");
		}
		*/

	}

}
