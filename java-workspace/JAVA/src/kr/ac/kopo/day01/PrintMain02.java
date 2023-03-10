package kr.ac.kopo.day01;

/*
 	printf : 변환문자를 이용하여 상수 출력
 		%c : 문자
 		%d : 10진수 정수
 		%f : 실수
 		%s : 문자열
 		%b : 논리값
 */

public class PrintMain02 {

	public static void main(String[] args) {
		System.out.print(5 < 3);
		System.out.print(true);
		System.out.print(false);
		System.out.printf("%d %f %s\n", 10, 12.34, "홍길동");
		System.out.printf("%d %.2f %s\n", 10, 12.34, "홍길동");
		//소수점 두자리까지만 나타내고 싶을 때 %f에 .과2를 추가하여 %.2f로 작성
		System.out.printf("%d %.1f %s\n", 10, 12.34, "홍길동");
		System.out.printf("[%d] %.1f %s\n", 10, 12.36-0.05, "홍길동");
		System.out.printf("[%d] %.1f %s\n", 1000, 12.36-0.05, "홍길동");
		System.out.printf("[%5d] %.1f %s\n", 10, 12.36-0.05, "홍길동");
		System.out.printf("[%5d] %.1f %s\n", 1000, 12.36-0.05, "홍길동");
		System.out.printf("[%05d] %.1f [%-10s]\n", 123, 12.36-0.05, "홍길동");
		//%5d에서 5 앞에 0을 붙이면 빈 공간을 0으로 매꿈
		System.out.printf("[%-5d] %.1f [%-10s]\n", 123, 12.36-0.05, "홍길동");
		System.out.printf("[%5d] %.1f [%-10s]\n", 12345678, 12.36-0.05, "홍길동");
		//%와 d 사이에 숫자를 입력하면 해다 숫자의 자리만큼 정수를 오른쪽 방향으로 나타냄 ex) 2 = 2번째 자리까지 나타냄
		//%와 d 사이에 -숫자를 입력하면 해다 숫자의 자리만큼 정수를 왼쪽 방향으로 나타냄 ex) 2 = 2번째 자리까지 나타냄
		System.out.printf("4 > 2 : %b\n", 4 > 2);

	}

}
