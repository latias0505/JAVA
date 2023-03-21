package kr.ac.kopo.day11Homework;

import java.util.Scanner;

public class IcecreamMain {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int buy = 1;
		
		for(int i = 1; i <= buy; i++) {
			System.out.print("아이스크림을 몇개 구매하시겠습니까 : ");
			int num = sc.nextInt();
			String[] icename = new String[num];
			int[] iceprice = new int[num];
			
			for(int j = 0; j <= num-1; j++) {
				
				String ice;
				int price;
				
				System.out.print("아이스크림 명 : ");
				ice = sc.next();
				icename[j] = ice;
				System.out.print("아이스크림 가격 : ");
				price = sc.nextInt();
				iceprice[j] = price;
				
				total += iceprice[j];
				
			}
			System.out.println("번호\t아이스크림 이름\t아이스크림 가격");
			for(int j = 0; j <= num-1; j++) {
				System.out.println(j+1 + "\t" + icename[j] + "\t" + "\t" + iceprice[j]);
			}
			
			System.out.println();
			System.out.println("총합 : " + total + "\n");
			System.out.println("계속 구매하시겠습니까? : 1.Y  2.N");
			int ans = sc.nextInt();
			if(ans != 1) {
				System.out.println();
				System.out.println("총 " + buy + "번의 구매정보 발생");
				System.out.println("총계 : " + total);
				break;
			}
			buy++;
		}

	}

}
