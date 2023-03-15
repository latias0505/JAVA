package kr.ac.kopo.day06Homework;

public class HomeworkMain04 {

	public static void main(String[] args) {
		
		int j=5;
		for(int i = 1; i <= 30; i++) {
			if(j < 50) {
				System.out.println("[" + i+"시간 후" + "]" + " " + "달팽이가 올라간 총 높이" + (j-1) + "M");
				j += 5;
				j--;
			} else if(j > 50 && j < 102){
				System.out.println("[" + i+"시간 후" + "]" + " " + "달팽이가 올라간 총 높이" + (j-2) + "M");
				j += 5;
				j -= 2;
			} else {
				System.out.println("[" + i+"시간 후" + "]" + " " + "달팽이는 성공적으로 우물에서 탈출했지만 그 이후의 소식은 들려오지 않았습니다.");
			}
			
		}
		
	}

}
