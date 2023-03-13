package kr.ac.kopo.day05;

public class BreakMain01 {

	public static void main(String[] args) {
		
		int cnt = 1;
		for(cnt = 1; cnt <= 10; cnt++) {
			
			if(cnt >= 3) {
				break; // for문에서 break를 만나면 루프가 강제로 종료됨
			}
			
			System.out.println("Hi");
		}
		System.out.println("cnt : " + cnt);
	}

}
