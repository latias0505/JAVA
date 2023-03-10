package kr.ac.kopo.day02;

public class VariableMain02 {

	public static void main(String[] args) {
		
		double num = 12.34; //double은 실수를 표현
		
		num = /*(double)*/34; //34앞에 (double)을 붙여 잠시동안 34를 실수형으로 인식하도록 형변환
		// 작은 데이터를 큰 데이터에 넣을 때 형변환을 생략해도 됨 = 묵시적 형변환
		
		System.out.println("num : " + num);
		
		int num2;  //int는 정수를 표현
		num2 = (int)45.67; //위에 double 형변환과 같이 45.67을 정수형으로 인식하도록 형변환 = 강제적(명시적) 형변환
		
		System.out.println("num2 : " + num2);
		
		float num3;
		num3 = (float)10.4; //float형의 형식이라고 강제적 형변환
		num3 = 10.4f; //float형의 원래 형태로 표현
		
		System.out.println("num3 : " + num3);
		
		System.out.println(12 + (int)12.34); //(int)12.34로 강제적 형변환을 진행하여 12와 덧셈 연산을 가능하게 만듦
		System.out.println(/*(double)*/12 + 12.34);
		//작은 데이터와 큰 데이터끼리 연산을 진행하면 자동적으로 작은 데이터가 큰 데이터에 맞춰 형변환이 진행됨 따로 형변환 필요x

	}

}


//자료형의 크기 비교 byte(char) < short < int < long < float < double
//자료형의 각 형태 표현 : double = 12.34, float = 10.4f, long = 23L