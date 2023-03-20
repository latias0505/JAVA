package kr.ac.kopo.day10;

public class Member {

	/** 이름 */
	String name;
	/** 나이 */
	int age;	
	/** 혈액형 */
	String bloodType;
	

	Member() {
		this("알 수 없음");
	}
	
	Member(String name) {
		this(name, -1);
		
	}
	
	Member(String name, int age) {
		this(name, age, "알 수 없음");
	}
	
	Member(String name, int age, String bloodType) {
		this.name = name; 
		this.age = age;
		this.bloodType = bloodType;
	}
	
/*
	Member() {
		
	this("알 수 없음", -1, "알 수 없음"); //매개변수를 초기화해서 다시 사용할 수 있게 하고 싶을 때 this 사용자를 쓴다.
		
//		this.name = "알 수 없음";
//		this.age = -1;
//		this.bloodType = "알 수 없음";
	}
	
	Member(String name) {
		
	this(name, -1, "알 수 없음");
		
//		this.name = name;  //멤버변수와 지역변수가 같을 때 this.을 붙이면 구분을 할 수 있음
//		this.age = -1;
//		this.bloodType = "알 수 없음";
	}
	
	Member(String name, int age) {
		
	this(name, age, "알 수 없음");
		
//		this.name = name;
//		this.age = age;
//		this.bloodType = "알 수 없음";
	}
	
	Member(String name, int age, String bloodType) {
		this.name = name; 
		this.age = age;
		this.bloodType = bloodType;
	}
*/
	
	void info() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 혈액형 : " + bloodType);
	}
}
