package kr.ac.kopo.day01;

/*
	출력메소드		System.out.출력메소드()
	print()		: 개행문자(enter)를 포함하고 있지 않음
	println()	: 개행문자(enter)를 포함하고 있음
	printf()
	
	숫자 뒤에 .을 붙이면 실수형
	
	''안에 문자를 넣으면 문자형의 형태가 됨
	' '  : space bar의 문자 형태 
	'\n' : enter키의 문자 형태
	'\t' : tab키의 문자 형태
	'\'' : '의 문자 형태
	'\\' : \의 문자 형태
	(\는 역슬래시)
	
	""안에 문자를 넣으면 문자열의 형태가 됨
 */

public class PrintMain {

	public static void main(String[] args) {
		
		//문자와 문자, 문자와 상수 등 조합할 경우 ''대신 "" 사용
		System.out.println(10 + " " + 12.34 + " " + "홍길동");
		
		// 10 12.34 홍길동
		System.out.print(10);
		System.out.print(' ');
		System.out.print(12.34);
		System.out.print(' ');
		System.out.println("홍길동");
		
		System.out.print("홍길동" + " " + 10 + " " + 12.34 + " " + "입니다." + '\n');
		
		System.out.print('홍');
		
		//방법1
		System.out.print("A\n");
		//방법2 
		System.out.print('A');
		System.out.print('\n');
		//방법3
		System.out.println('A');
		
		System.out.println(10);
		System.out.println(12.34);
	}
}
