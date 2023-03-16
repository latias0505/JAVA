package kr.ac.kopo.day08Homework;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		Student st4 = new Student();
		Student st5 = new Student();
		
		Student[] arr = {st1, st2, st3, st4, st5};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 학생의 성적 : ");
			arr[i].num = i + 1;
			arr[i].score = sc.nextInt();
		}
		
		System.out.println("     < PRINT >");
		System.out.println("번호\t성적\t학점");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		int error = 0;
		int total = 0;
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j].num + "\t");
			if(arr[j].score >= 90 && arr[j].score <= 100) {
				arr[j].grade = 'A';
			} else if(arr[j].score >= 80 && arr[j].score < 90) {
				arr[j].grade = 'B';
			} else if(arr[j].score >= 70 && arr[j].score < 80) {
				arr[j].grade = 'C';
			} else if(arr[j].score >= 60 && arr[j].score < 70) {
				arr[j].grade = 'D';
			} else if(arr[j].score >= 0 && arr[j].score < 60) {
				arr[j].grade = 'F';
			} else {
				System.out.print("ERROR");
				error++;
			}
			System.out.println(arr[j].score + "\t" + arr[j].grade);
			total += arr[j].score;
		}
		System.out.println();
		System.out.println("총점 : " + total + "점");
		System.out.printf("평균 : " + (double)total / 5);
		System.out.println();
		System.out.println();
		System.out.println("학생 5명중에 " + error + "회 에러발생");

	}

}
