package kr.ac.kopo.day09;

public class methodMain01 {
	
	static int prnStar(int num, String data) { //피호출자 메소드
		//()안에 함수를 넣으면 호출자가 넘겨준 입력값 또는 함수값을 ()안에 있는 변수에 저장함 (여러개도 가능)
		System.out.println("**********");
		System.out.println("호출자가 넘겨준 정수 : " + num);
		System.out.println("호출자가 넘겨준 문자열 : " + data);
		int sum = num%10 + num/10;
		
		return sum;
	}

	public static void main(String[] args) { //호출자 메소드
		
		int cnt = 10;
		int s = prnStar(cnt, "abc"); //()안에 입력값 또는 함수를 넣으면 피호출자 메소드에게 해당 입력값 또는 함수값을 넘겨줌 (여러개도 가능)
		System.out.println("자리수 합 : " + s);
		System.out.println("Helloa");
		prnStar(5, "hi"); //이전에 피호출자에게 넘겨준 값 위에 새 값을 덮어씌움
		System.out.println("자리수 합 : " + s);
		System.out.println("Hi");
		prnStar(24, "good");
		System.out.println("자리수 합 : " + s);
		System.out.println("Good-bye");
		prnStar(9, "bye");
		System.out.println("자리수 합 : " + s);

	}

}
