package kr.ac.kopo.day12.extend;

public class Manager03 extends Employee { // Employee의 데이터를 상속받아서 사용
	
//	int no;			// Employee의 데이터를 상속받아 중복되는 코드는 사용할 필요x
//	String name;
//	int salary;
//	String grade;
	Employee[] empList;  //관리사원 목록
	
	public Manager03() {
		
	}
	
	public Manager03(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade); // super를 이용해 extends로 받은 부모 클래스에 코드로 제어함
		this.empList = empList;
	}
	@Override // 부모 클래스에 있는 코드를 한번 더 써서 재정의했다는 의미로 @Override 라는 주석을 달아줌
		      // 이 때 생성한 주석은 부모 클래스의 코드와 같은지 문법체크까지 해줌
	public void info() {
		super.info();
		System.out.println("사번 : " + no + ", 이름 : " + name + ", 연봉 : " + salary + ", 직급 : " + grade);
		System.out.println("---------------------------------------------");
		System.out.println("\t       < 관리사원 리스트>");
		System.out.println("---------------------------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("---------------------------------------------");
	}

}
