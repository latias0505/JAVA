package kr.ac.kopo.day01;

public class ConstantMain {

	public static void main(String[] args) {
		
		final int FIRST_NUM = 10;
		//변수에 final 키워드를 붙이면 중간에 수정 불가능 final변수를 붙이면 변수를 대문자로 변경
		//ex)int firstNum -> final int FIRST_NUM
		int secondNum = 123;
		
		//FIRST_NUM = 200;
		
		System.out.println(FIRST_NUM + secondNum);

	}

}
