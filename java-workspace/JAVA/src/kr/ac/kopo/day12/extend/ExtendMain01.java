package kr.ac.kopo.day12.extend;

class One{
	One() {
		System.out.println("One() 생성자 호출...");
	}

}
class Two extends One { //extends로 one 클래스의 정보를 상속받음
	Two() {
		System.out.println("Two() 생성자 호출...");
	}
}

class Three extends Two { //extends로 One의 클래스 정보를 상속받은 Two 클래스의 정보를 상속받음
	Three() {
		System.out.println("Three() 생성자 호출...");
	}
}


public class ExtendMain01 {

	public static void main(String[] args) {
//		new One();
//		new Two();
		new Three();
	}

}
