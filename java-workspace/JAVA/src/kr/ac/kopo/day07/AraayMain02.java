package kr.ac.kopo.day07;

public class AraayMain02 {

	public static void main(String[] args) {
		
//		int [] arr = {10, 20, 30, 40, 50};
		int [] arr = new int[] {10, 20, 30, 40, 50};
		
		/*
		int[] arr = new int [5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
		}
		*/
		
//		arr = new int[10];
		
		System.out.println("< PRINT >");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
