/*
	<게임 설명>
	
	로봇이 랜덤한 3자리의 숫자를 정하면 플레이어가 그 3자리를 맞추는 게임입니다.
	
	기본적인 기회는 총 6회가 주어지며 6회를 모두 소진할 경우 게임이 끝나게 됩니다.
	만약 볼을 적립하게 되면 1번의 추가 기회가 생깁니다.
	
	게임에서 승리하는 방법은 세자리의 숫자를 모두 맞추는 3볼을 하시면 됩니다.
	만약 3볼을 하지 못 할 경우 실패 카운트가 한개씩 적립됩니다.
	실패카운트가 3번 적립될 경우 1아웃이 선언되고 최종적으로 3아웃이 선언되면 게임에서 패배합니다.
	
	스트라이크와 볼 카운트가 올라가는 조건은 아래와 같습니다.
	
	스트라이크 = 3자리 숫자 중 숫자는 같지만 위치가 다른 숫자가 스트라이크의 숫자만큼 있음
	볼 = 숫자와 위치가 모두 같은 숫자가 볼의 숫자만큼 있음
	
*/
package kr.ac.kopo.day14Homework;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	static void number(int num1, int num2, int num3) {  //랜덤숫자 3개를 받아서 게임을 진행하는 공간
		
		Scanner sc = new Scanner(System.in);
		
		int game = 6;
		int fail = 0;
		int out = 0;
		
		for(int i = 0; i < game; i++) {
			
			System.out.print("3자리 숫자를 입력하세요 : ");
			int num4 = sc.nextInt();
			int num5 = num4 / 100; 
			int num6 = (num4 % 100) / 10;
			int num7 = num4 % 10;
			int strike = 0;
			int ball = 0;
			
			int[] rdnum = {num1, num2, num3};
			int[] mynum = {num5, num6, num7};
			
			for(int j = 0; j < rdnum.length; j++) {
				for(int k = 0; k < mynum.length; k++) {
					if(mynum[k] == rdnum[j]) {
						if(k == j) {
							ball++;
							game++;
						} else {
							strike++;
						}
					}
				}
			}
			System.out.println("스트라이크 : " + strike + ", 볼 : " + ball + ", 아웃 : " + out);
			
			if(ball != 3) {
				fail++;			
			}
			
			if(out == 1 && fail == 0) {
				System.out.println("원아웃");
			}
			
			if(out == 2 && fail == 0) {
				System.out.println("투아웃");
			}
			
			if(fail == 3) {
				fail = 0;
				out++;
			}
			
			if(ball == 3) {
				System.out.println("\n축하드립니다. 정답입니다.");
				break;
			}
		
			if(out == 3) {
				System.out.println("\n쓰리아웃으로 게임이 끝났습니다.");
				System.out.println("정답 : " + num1 + "" + num2 + "" + num3);
				break;
			}
			
			if(i == game) {
				System.out.println("\n기회를 전부 소진하셨습니다.");
				System.out.println("정답 : " + num1 + "" + num2 + "" + num3);
			}
						
		}
		
		
		
	}

    public static void main(String[] args) { //메인에서 랜덤숫자 3개를 생성함
    	
    	Main e = new Main();

        int[] arr = new int[3];

        Scanner sc = new Scanner(System.in);

        Random r = new Random();

        for(int i = 0; i < 3; i++) {
            int random = r.nextInt(9) + 1;
            arr[i] = random;

            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        e.number(arr[0], arr[1], arr[2]);

    }

}
