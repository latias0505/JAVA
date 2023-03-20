package kr.ac.kopo.day10;

public class MethodExamMain {

	public static void main(String[] args) {
		
		MethodExam exam = new MethodExam();
		
		int total = exam.getTotal(10, 100);
		System.out.println("10 ~ 100사이의 총합 : " + total);
		
		exam.printGugudan(5);
		exam.printGugudan();
		
		System.out.print("시작단 : ");
		int startDan = exam.getDan();
		System.out.print("종료단 : ");
		int endDan = exam.getDan();
		exam.printGugudan(startDan,endDan);

	}

}
