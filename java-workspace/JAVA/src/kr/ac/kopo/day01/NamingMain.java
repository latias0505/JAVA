package kr.ac.kopo.day01;

/*
 	명명규칙에 의거하여 클래스, 변수, 메소드 구분하기
 	클래스(대문자로 시작):4 = NamingMain, String, Integer, System
 	메소드(괄호가 붙음):3 = main(), parseInt(), println()
 	변수(소문자 단일 객체) :3 = args, no, out
 */

public class NamingMain {

	public static void main(String[] args) {
		
		int no;
		no = Integer.parseInt("123");
		
		System.out.println(no);

	}

}
