package kr.ac.kopo.day10;

public class StringMain02 {

	public static void main(String[] args) {

		String str01 = new String("hello world");
		String str02 = new String("Hello World");
		
		System.out.println("str01 : [" + str01 + "]");
		System.out.println("str02 : [" + str02 + "]");
		
		if(str01 == str02) { //문자열을 비교하는게 아닌 주소를 비교하여 판단함
			System.out.println("[주소비교]str01 == str02");
		} else {
			System.out.println("[주소비교]str01 != str02");
		}
		
		boolean bool = str01.equals(str02); //각 문자열의 값을 비교하여 같은지 아닌지 판단 (대소문자를 구분함)
		if(bool) {
			System.out.println("[값비교]str01 == str02");
		} else {
			System.out.println("[값비교]str01 != str02");
		}
		
		bool = str01.equalsIgnoreCase(str02);
		if(bool) {
			System.out.println("[값비교]str01 == str02");
		} else {
			System.out.println("[값비교]str01 != str02");
		}
		
		String[] names = {"홍길동", "강길동", "홍길순", "홍길남", "김길순", "김길남", "길동홍"};
		
		System.out.println("< 홍길동인 사람을 검색>");
		for(String name : names) {
			if(name.equals("홍길동")) {
			System.out.println(name);
			}
			
		}
		
		System.out.println("< 홍씨 성을 가진 사람을 검색 >");
		for(String name : names) {
			if(name.startsWith("홍")) { //시작 단어가 원하는 단어와 같으면
				System.out.println(name);
			}
			
		}
		
		System.out.println("< 이름이 길동인 사람을 검색 >");
		for(String name : names) {
			if(name.endsWith("길동")) { //끝나는 단어가 원하는 단어와 같으면
				System.out.println(name);
			}
		}
		
		System.out.println("< \"길동\"이 포함된 사람을 검색 >");
		for(String name : names) {
			if(name.contains("길동")) { //시작 단어나 끝나는 단어 구분 없이 원하는 단어와 같으면
				System.out.println(name);
			}
		}
		
		str01 = "banana";
		str02 = "boat";
		
		int cmp = str01.compareTo(str02);
		if(cmp == 0) {
			System.out.println(str01 + " == " + str02);
		} else if(cmp > 0) {
			System.out.println(str02 + " < " + str01);
		} else {
			System.out.println(str01 + " < " + str02);
		}
	}

}
