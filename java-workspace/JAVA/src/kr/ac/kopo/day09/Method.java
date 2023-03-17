package kr.ac.kopo.day09;

public class Method {
	
	int data = 10;
	
	void call() {
		System.out.println("call() 메소드 호출...");
		System.out.println(data);
	}
	
	void call(double d) { //같은 메소드지만 ()안에 다른 파라미터를 넣으면 다른 메소드로 인식함
		System.out.println("call(double) 메소드 호출...");
		System.out.println(data);
	}
	
	void call(int i) { 
		System.out.println("call(int) 메소드 호출...");
	}
	
	void call(String s, int i) { 
		System.out.println("call(String,int) 메소드 호출...");
	}
	
}
