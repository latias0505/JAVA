package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {
		
		System.out.println("==== start ====");
		
		Random r = new Random();
		int random = r.nextInt(3);
		
		try {
		
			System.out.println("random : " + random);
			System.out.println(10 / random);
		} catch(ArithmeticException ae) {
			System.out.println("예외발생!!!");
			System.out.println(ae.getMessage());  //에러 난 부분에서 어떤 부분이 문제인지 알려주는 코드
			ae.printStackTrace();  //에러 난 부분을 찝어서 알려주는 코드
		}
		
		System.out.println("==== end ====");
		
	}

}
