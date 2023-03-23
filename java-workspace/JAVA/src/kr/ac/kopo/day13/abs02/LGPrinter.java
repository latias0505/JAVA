package kr.ac.kopo.day13.abs02;

public class LGPrinter extends Printer{
	
	private String model;
	public LGPrinter() {
		model = "LG프린터";
	}
	
	public void lgPrint() {
		System.out.println(model + "에서 출력중...");
	}
	
	public void print() {  //추상메소드가 있는 클래스(Printer)를 상속받은 클래스에서는 상속받은 부모 클래스를 오버라이드 해야함
			System.out.println("LG프린터에서 출력중...");	
		
	}

}
