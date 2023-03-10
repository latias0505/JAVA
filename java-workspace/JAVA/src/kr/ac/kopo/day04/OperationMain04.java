package kr.ac.kopo.day04;

/*
 	두개 정수 입력 : 12 5
 	12는 5의 배수판단 : 배수가 아닙니다.
 	
 	두개 정수 입력 : 12 6
 	12는 6의 배수판단 : 배수입니다.
 */

public class OperationMain04 {

	public static void main(String[] args) {
		
//		String msg = true ? "배수 입니다." : "배수가 아닙니다.";
//		System.out.println(10 > 4 ? "배수 입니다." : "배수가 아닙니다다.");
		
		int num01 = 15, num02 = 3; //두 형태가 같으면 ,를 이용해 연속으로 쓸 수 있음
		
		boolean bool = (num02 !=0 && num01 % num02 == 0);
		
		String result = bool ? "배수 입니다." : "배수가 아닙니다."; //bool 변수의 값이 true : false에 따라 출력 문장이 정해짐
		
		System.out.printf("%d는 %d의 배수판단 : %s\n", num01, num02, result);
//		       작성 순서대로 num01 num02        %s\n에서 s는 위 명령어 문장에 String을 표현
	}

}
