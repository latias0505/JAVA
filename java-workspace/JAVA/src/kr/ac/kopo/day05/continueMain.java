package kr.ac.kopo.day05;

public class continueMain {

	public static void main(String[] args) {
		
		int cnt;
		for(cnt = 1; cnt <= 10; cnt++) {
			
			if(cnt == 3) {
				continue; 
			}  //루프를 돌다가 continue를 만나면 continue 아래의 문장을 이행하지 않고 한번의 싸이클이 돌았다고 생각하고 증가값으로 바로 이동시킴
			
			System.out.println("Hi");
		}
		System.out.println("cnt" + cnt);
	}

}
