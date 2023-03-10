package kr.ac.kopo.day04;
import java.util.Scanner;

/*
 	1 - 3사이의 정수 입력 :
 	
 	1입력 => ONE
 	2입력 => TWO
 	3입력 => THREE
 	그외입력 => ERROR
*/

public class SwitchMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 3 사이의 정수 : ");
		int no = sc.nextInt();
		
		switch(no) { //switch문에서 case에 들어가는 값은 정수,문자,문자열만 입력 가능 문자열도 JDK 1.7 버전 이후부터 사용 가능
		case 1 : //if문의 if와 같은 역활이지만 break;가 없으면 해당되는 프린트문부터 아래의 있는 프린트문이 전부 출력됨
			System.out.println("ONE");
			break; //해당 명령어가 수행되고 아래의 명령어가 연속으로 수행되지 않게 종료시켜주는 명령어 (switch문에서만 사용 가능 if문은x)
		case 2 :
			System.out.println("TWO");
			break;
		case 3 :
			System.out.println("THREE");
			break;
		default : //if문의 else와 같은 역활 (if문의 else와는 다르게 꼭 맨 밑에 있을 필요는 없음 하지만 왠만하면 마지막에 쓰는게 좋다.)
			System.out.println("ERROR");
		}
		
		/*
		if(no == 1) {
			System.out.println("ONE");
		} else if(no == 2) {
			System.out.println("TWO");
		} else if(no == 3) {
			System.out.println("THREE");
		} else {
			System.out.println("ERROR");
		}
		*/

	}

}
