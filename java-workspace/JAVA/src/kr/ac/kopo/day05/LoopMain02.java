package kr.ac.kopo.day05;

public class LoopMain02 {

	public static void main(String[] args) {
		
		for(int cnt = 1; cnt < 5; ++cnt) { //함수 생성, 언제까지 반복시킬건지, 증가 값 순서로 입력
			System.out.println("Hello");
		}
		
		for(int cnt = 1; cnt <3; cnt++) { //for문에서는 위에 for문에서 사용했던 함수를 다른 for문에서도 새로 사용할 수 있음
			System.out.println("Good-bye");
		}
	}

}
