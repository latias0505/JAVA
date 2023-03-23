package kr.ac.kopo.day13.abs02;

public class CastMain01 {
	
	public static void print(Child01 c) {
		c.info();
	}
	
	public static void print(Child02 c) {
		c.info();
	}
	
	public static void print(Parent c) {
		c.info();
	}
	
	public static void main(String[] args) {
		
		print(new Child01());
		print(new Child02());
		print(new Parent());
		
//		Child01 c01 = new Child01();
//		c01.info();
//		
//		Child02 c02 = new Child02();
//		c02.info();
//		
//		Parent p = new Parent();
//		p.info();
		
/*		Child01 c01 = new Child01();
		c01.info();
		c01.sleep();
		c01.study();
		
		Parent p = new Child01();
		p.info();
//		p.sleep();  // 부모 메소드로 자식 메소드에 접근 불가
//		p.study();
		*/
	}

}
