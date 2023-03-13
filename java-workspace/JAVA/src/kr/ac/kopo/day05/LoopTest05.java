package kr.ac.kopo.day05;

public class LoopTest05 {

	public static void main(String[] args) {
		
		for(int cnt = 5; cnt >= 1; --cnt) {
			
			for(int num1 = cnt; num1 <= cnt+4; ++num1) {
				System.out.print(num1);
			}
			
		System.out.println();
		}

	}

}
