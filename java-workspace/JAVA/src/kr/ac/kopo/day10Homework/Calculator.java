package kr.ac.kopo.day10Homework;

public class Calculator {
	
	static int plus(int num1, int num2) {
		
		int plus = num1 + num2; 
		
		return plus;
		
	}
	
	static int minus(int num1, int num2) {
		int minus = num1 - num2;
		
		return minus;
	}
	
	static int mul(int num1, int num2) {
		int mul = num1 * num2;
		
		return mul;
	}
	
	static double divide(double num1, double num2) {
		double divide = num1 / num2;
		
		return divide;
	}
	
	static String dec1(int num1) {
		int dec1 = num1;
		for(int i = 2; i <= num1-1; i++) {
			if(num1 % i != 0) {
				return "true";
			} else {
				return "false";
			}
		}
		return null;
		
		
	}
	
	static String dec2(int num2) {
		int dec1 = num2;
		for(int i = 2; i <= num2-1; i++) {
			if(num2 % i != 0) {
				return "true";
			} else {
				return "false";
			}
		}
		return null;
		
		
	}

	public static void main(String[] args) {
		Calculator e = new Calculator();
		
		System.out.println("정수1 : " + 12);
		System.out.println("정수2 : " + 5);
		System.out.println();
		System.out.println(12 + " + " + 5 + " = " + e.plus(12, 5));
		System.out.println(12 + " - " + 5 + " = " + e.minus(12, 5));
		System.out.println(12 + " x " + 5 + " = " + e.mul(12, 5));
		System.out.println(12 + " ÷ " + 5 + " = " + e.divide(12, 5));
		System.out.println(12 + " 소수체크" + " = " +  e.dec1(12));
		System.out.println(5 + " 소수체크" + " = " +  e.dec2(5));
	}

}
