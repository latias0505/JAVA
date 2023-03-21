package kr.ac.kopo.day10Homework;

public class StringUtil {
	
	//1
	boolean isUpperChar(char c) {
		
		return c >= 'A' && c <= 'Z' ? true : false;
		}
	
	//2
	boolean isLowerChar(char c) {
		
		return c >= 'A' && c <= 'z' ? true : false;
	}
	
	//3
	int max(int i, int j) {
		
		return i > j ? i : j;
	}
	
	//4
	int min(int i, int j) {
		
		return i < j ? i : j;
	}
	
	//5
	static String reverseString(String str) {
		int j = 0;
		char[] chars = str.toCharArray();
		for(int i = chars.length; i >= 0; i--) {
			chars[j] = chars[i];
			j++;
		}
		return new String(chars);
	}
	
	//2023.03.21
	
	//1
	
	
		
	

	public static void main(String[] args) {
		
		System.out.println("abcde");
		
	}

}
