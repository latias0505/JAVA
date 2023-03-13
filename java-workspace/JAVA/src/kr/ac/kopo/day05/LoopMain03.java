package kr.ac.kopo.day05;

public class LoopMain03 {

	public static void main(String[] args) {
		
		int cnt = 1;
		do{ //do ~ while => 최소 한번은 동작하도록 명령
			System.out.println("Hello");
			++cnt;
		}while(cnt <= 5); //while문을 밑으로 내리는 경우에는 위에 블록과 같은 묶음이라는걸 표현하기 위해 while문에 ;을 붙임
		
	}

}
