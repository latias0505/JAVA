package kr.ac.kopo.day11HomeworkReview;

import kr.ac.kopo.day11.ScannerUtil;

public class IceCreamMarket {

	void open() {
		
		ScannerUtil scan = new ScannerUtil();
		
		int cnt = scan.nextInt("아이스트림을 몇 개 구입하시겠습니까? : ");
		IceCream[] iceArr = new IceCream[cnt];
		
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println("*** %d번째 아이스크림 구매정보 입력 ***\n");
			String name = scan.nextString("아이스크림 명 : ");
			int price = scan.nextInt("아이스크림 가격 : ");
			
			iceArr[i] = new IceCream(name, price);
		}
		
		System.out.printf("< 총 %d개 아이스크림 구매정보 출력 >\n", iceArr.length);
		System.out.println("----------------------------------------");
		System.out.println("번호\t아이스크림 명\t아이스크림 가격");
		System.out.println("----------------------------------------");
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println(i+1 + "\t" + iceArr[i].getName() + "\t" + iceArr[i].getPrice());
		}
		System.out.println("----------------------------------------");
		IceCream.TotalInfo();
	}

	
}
