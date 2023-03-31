package kr.ac.kopo.day18Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kr.ac.kopo.day12Homework.Square;

public class Main {

	public static void main(String[] args) {
		
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		List<Members> memberList = new ArrayList<>();
		
		memberList.add(new Members("id1", "pass1"));
		memberList.add(new Members("id2", "pass2"));
		memberList.add(new Members("id3", "pass3"));
		
		System.out.println("< 비밀번호 변경서비스 >\n");
		System.out.print("아이디를 입력해주세요 : ");
		String uid = sc.nextLine();
		
		for(int i = 0; i <= 2; i++) {
			if((memberList.get(i)).getId().equals(uid)) {
				cnt = 0;
				break;
			} else {
				System.out.println("입력하신 아이디는 존재하지 않는 아이디 입니다.");
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			}
		}
		
		System.out.print("비밀번호를 입력해주세요 : ");
		String upass = sc.nextLine();
		
		for(int i = 0; i <= 2; i++) {
			if((memberList.get(i)).getPass().equals(upass)) {
				break;
			} else {
				System.out.println("입력하신 비밀번호가 일치하지 않습니다.");
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			}
		}
		
		System.out.println("변경할 비밀번호를 입력해주세요 : ");
		String newpass = sc.nextLine();
		
		

	}

}
