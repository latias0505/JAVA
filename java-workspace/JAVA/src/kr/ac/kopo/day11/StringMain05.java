package kr.ac.kopo.day11;

import java.util.Arrays;

public class StringMain05 {

	public static void main(String[] args) {
		
		String str = "Hello World!!!";
		
		System.out.println("str : [" + str + "]");
		String sub = str.substring(3, 8);
		System.out.println("sub : [" + sub + "]");
		
		int idx = str.indexOf("World");
		sub = str.substring(idx);
		System.out.println("sub : [" + sub + "]");
		
		
		str = "Hello World!!";
		idx = str.indexOf("World");
		sub = str.substring(idx, idx+"World".length());
		System.out.println("sub : [" + sub + "]");
		
		String a = "Hello";
		String b = "Good-bye";
//		String c = a + b;
		String c = a.concat(b); //위에 a+b와 같은 의미를 만들어주는 코드
		System.out.println("c : " + c);
		
		String str2 = str.replace("l", "rr"); // l을 rr로 바꾸고 싶다는 의미의 코드
		System.out.println("str : [" + str + "]");
		System.out.println("str2 : [" + str2 + "]");
		
		str = "     Hello  world     ";
		System.out.println("[" + str + "]의 길이 : " + str.length());
		str = str.trim(); // 문자형의 좌우 공백을 지우고 싶을 때 사용 (문자열 중간의 공백은 지울 수 없음)
		System.out.println("[" + str + "]의 길이 : " + str.length());
		
		str = "Hello World";
		System.out.println("toUpperCase() : " + str.toUpperCase());
		System.out.println("toUpperCase() : " + str.toLowerCase());
		
		str = "경기도 성남시 수정로 398";
		String [] strArr = str.split(" "); //공백을 기준으로 분리시킬 때 사용하는 코드
		System.out.println("str : [" + str + "]");
		System.out.println(Arrays.toString(strArr));
		
		String ip = "172.31.9.164";
		String[] ipArr = ip.split("\\."); // .과 같은은 문자는 이미 다른 의미를 가지고 있기 때문에 \\를 붙여야 .을 기준으로 분리가 가능
		System.out.println("ip : " + ip);
		System.out.println(Arrays.toString(ipArr));
		
		int no = 123;
		double no2 = 10.23;
		
		System.out.println(no + 100);   //결과 : 223
		System.out.println(no2 + 100);  //결과 : 110.23
		
		//숫자열을 문자열로 변경할 때 사용하는 코드
		System.out.println(String.valueOf(no) + 100);   //결과 : "123100"
		System.out.println(String.valueOf(no2) + 100);  //결과 : "10.23100"
		
		
	}

}
