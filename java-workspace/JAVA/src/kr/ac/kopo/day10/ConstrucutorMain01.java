package kr.ac.kopo.day10;

/*
 	생성자 특징
 	1. 클래스명과 동일
 	2. 반환값 존재 안함
 	3. default 생성자 지원 : 클래스내에 생성자가 하나도 정의되어 있지 않은 경우
 						  JVM에서 자동으로 생성
 	4. 생성자 오버로딩 지원
 	5. 멤버변수값 초기화
 */

class Dog{
	Dog() {
		System.out.println("디폴트 생성자 Dog() 호출....");
	}
	
	Dog(int i) {
		System.out.println("Dog(int) 생성자 호출...");
	}
}

public class ConstrucutorMain01 {

	public static void main(String[] args) {
		
//		new Dog;
		new Dog(10);
	}

}
