package kr.ac.kopo.day13.abs02;

public class CastMain02 {
	
	public static void main(String[] args) {
		
		// 컴파일 오류 발생 
//		Child01 c = new Parent();
		
		// 실행 시 오류 발생
//		Child c = (Child01)new Parent();
		
		Parent p = new Child01();
		
		Child01 c = (Child01)p;
		
	}

}
