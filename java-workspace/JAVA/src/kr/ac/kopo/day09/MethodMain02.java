package kr.ac.kopo.day09;

public class MethodMain02 {

	public static void main(String[] args) {
		Method m = new Method(); // 다른 클래스에 있는 메소드를 호출하기 위한 함수
		m.call(); // 함수로 다른 클래스에 있는 메소드를 호출하기
		m.call(10);

	}

}
