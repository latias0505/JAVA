package kr.ac.kopo.day16Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoView {

	public void start() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("게임수를 입력 : ");
		int gameCnt = sc.nextInt(); // 몇회의 게임을 할건지 횟수를 입력받음
		
		for(int i = 1; i <= gameCnt; i++) {
			System.out.println("게임 " + i + " : " + Arrays.toString(getLotto4()));
		}
		
	}
	
	// 1번째 : 1부터 45까지 숫자중에 랜덤한 숫자 6개 도또번호 뽑기
	
	private int[] getLotto1() {
	
		Random r = new Random();
		int[] arr = new int[6];
		
		int num1 = 6;
	    int num2 = 0;
	    for(int i = 0; i < num1; i++) {
	        int random = r.nextInt(45) + 1;
	        boolean dup = false;
	        for(int j = 0; j < num2; j++) {
	            if(arr[j] == random) {
	                dup = true;
	                break;
	            }
	        }
	        if(!dup) {
	            arr[num2++] = random;
	        } else {
	            i--;
	        }
	    }
	    return arr;
	}
	
	// 2번째 : set을 이용하여 로또번호 뽑기
	
	private Integer[] getLotto2() {
	    Random r = new Random();
	    Integer[] arr = new Integer[6];
	    int num1 = 6;
	    Set<Integer> set = new HashSet<>();
	    for (int i = 0; i < num1; i++) {
	        int random = r.nextInt(45) + 1;
	        if (set.add(random)) {
	            arr[i] = random;
	        } else {
	            i--;
	        }
	    }
	    return arr;
	}

	// 3번째 : List를 이용하여 로또번호 뽑기
		
	private Integer[] getLotto3() {
	    Random r = new Random();
	    Integer[] arr = new Integer[6];
	    int num1 = 6;
	    List<Integer> set = new ArrayList<>();
	    for(int i = 0; i < num1; i++) {
	    	int random = r.nextInt(45) + 1;
	    	if(!set.contains(random)) {
	    		set.add(random);
	    	} else {
	    		num1++;
	    	}
	    }
	    arr = set.toArray(new Integer[set.size()]);
	    
	    return arr;
	}
	
	// 4번째 : 1부터 45까지 배열에 저장해놓고 배열에서 로또번호 뽑기
	
	private Integer[] getLotto4() {
	    Random r = new Random();
	    Integer[] arr1 = new Integer[45];
	    Integer[] arr2 = new Integer[6];
	    for(int i = 0; i < 45; i++) {
	        arr1[i] = i+1;
	    }
	    for(int i = 0; i < 6; i++) {
	        int random = r.nextInt(45 - i) + i;
	        arr2[i] = arr1[random];
	        arr1[random] = arr1[i];
	    }
	    return arr2;
	}
	
	// 5번째
	
	// 5번째는 도저히 생각이 안났습니다....
		
}
