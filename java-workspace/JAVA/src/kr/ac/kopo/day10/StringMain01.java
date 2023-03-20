package kr.ac.kopo.day10;

import java.util.Arrays;

public class StringMain01 {

	public static void main(String[] args) {
		
		String str = new String();
		String str2 = new String("Hello");
		char[] chars = {'H', 'e', 'l', 'l', 'o'};
		String str3 = new String(chars);
		byte[] bytes = {72, 101, 109, 109, 110};
		String str4 = new String(bytes);
		
		System.out.println("str : [" + str + "]");
		System.out.println("str : [" + str2 + "]");
		System.out.println("str : [" + str3 + "]");
		System.out.println("str : [" + str4 + "]");
		
		System.out.println(str4 + "의 길이 : " + str4.length());
		
		for(int i = 0; i < str4.length(); i++) {
			System.out.println(i + "번째 문자 :" + str4.charAt(i));
		}
		
		chars = new char[10];
		System.out.println("chars : " + Arrays.toString(chars));
//		str4.getChars(0, str4.length(), chars, 0);
		str4.getChars(2, 4, chars, 6);
		System.out.println("chars : " + Arrays.toString(chars));

	}

}
