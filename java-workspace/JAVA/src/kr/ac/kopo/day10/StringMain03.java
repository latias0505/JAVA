package kr.ac.kopo.day10;

public class StringMain03 {

	public static void main(String[] args) {
	
		String str = "Hello World";
		char ch = 'r';
		
		System.out.println("str : [" + str + "]");
		int idx = str.indexOf(ch); //찾고자 하는 문자가 몇번째 순서에 있는지 찾아줌 단. 같은 단어가 여러개일 경우 제일 빠른 순서를 알려줌
		System.out.println(ch + "위치 : " + idx);
//		System.out.println(ch + "위치 : " + str.indexOf(ch));

		ch = 'p';
		System.out.println(ch + "위치 : " + str.indexOf(ch));
		
		String searchStr = "lo";
		System.out.println(searchStr + "위치 : " + str.indexOf(ch));
		
		ch = 'l';
		System.out.println("indexOf    " + ch + "위치 : " + str.indexOf(ch));
		System.out.println("indexof    " + ch + "위치 : " + str.indexOf(ch, 3));
		System.out.println("lastIndexOf" + ch + "위치 : " + str.lastIndexOf(ch)); //몇번째 순서인지 역순으로 검색해서 알려줌
		
	}

}
