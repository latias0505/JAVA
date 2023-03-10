package kr.ac.kopo.day03;

public class OperationMain01 {

	public static void main(String[] args) {
		
		int num = 123;
		
//		num = num + 1;
		
//		num = num + 50;

		num +=50;  //두가지의 의미를 가지는 복합대입연산자, 배정연산자 : +=, -=, *=, /=, %=
		
		num +=1;
		
		++num; /*num++;*/ //대입연산자(=)없이 변수의 값을 1씩 증가시키는 증가연산자 : 단항에서만 사용 가능
		--num; /*num--;*/ //대입연산자(=)없이 변수의 값을 1씩 감소시키는 감소연산자 : 단항에서만 사용 가능
		
		System.out.println("num : " + num);
		//Sysout 치고 컨트롤 + 스페이스바 누르면 프린트 문장 자동 완성
		
		int a = 10;
		
		System.out.println(a + 20);
		
		System.out.println(a);
		
		// System.out.println(++a); 는 a=a+1 -> print(a); 의 순서로 해석하여 결과값 a+1 로 출력됨
		// int a=5; int b=++a; 역시 위와 같은 형태
		
		// System.out.println(a++); 는 print(a); -> a=a+1 의 순서로 해석하여 결과값 a 로 출력하고 a값에 1을 추가하여 저장하고 출력은x
		// int a=5; int b=a++; 역시 위와 같은 형태
		
		// && : A&&B = A와 B가 참일 경우에 참을 반환 (and연산)
		// ||(|는 쉬프트\를 누르면 나옴) : A||B = A와 B 둘 중에 하나가 참일 경우에 참을 반환 (or연산)
		// ! : A! = A가 참이면 거짓을 반환 거짓이면 참을 반환 (not연산)

	}

}