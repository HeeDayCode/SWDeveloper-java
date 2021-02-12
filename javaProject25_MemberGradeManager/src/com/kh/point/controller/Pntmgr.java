package com.kh.point.controller;

import java.util.Scanner;

import com.kh.point.vo.Gold;
import com.kh.point.vo.Grade;
import com.kh.point.vo.Silver;
import com.kh.point.vo.Vip;

public class Pntmgr implements PointMgr {
	private Scanner sc = new Scanner(System.in);
	private Grade[] g = new Grade[2];
	private int index = 0;

	public void start() // 기본 로직을 동작시키는 메소드
	{
		while (true) {
			System.out.println("====== 포인트 회원 관리 시스템 ver 1.0 ======");
			System.out.println("1. 회원정보 입력");
			System.out.println("2. 회원정보 출력");
			System.out.println("3. 회원정보 수정");
			System.out.println("4. 회원정보 삭제");
			System.out.println("0. 프로그램 종료 ");
			System.out.print("선택 : ");
			int select = sc.nextInt();
			if (select == 0) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}

			switch (select) {
			case 1:
				memberInsertData();
				break;// 회원정보 입력
			case 2:
				memberAllPrintData();
				break;// 회원정보 출력
			case 3:
				memberModifyData();
				break;// 회원정보 수정
			case 4:
				memberDeleteData();
				break;// 회원정보 삭제
			}
		}
	}

	@Override
	public void memberInsertData() {
		System.out.print("등록할 회원 이름 : ");
		String name = sc.next();
		System.out.print("등록할 회원 등급(1.Silver/2.Gold/3.Vip) : ");
		int grade = sc.nextInt();

		System.out.print("등록할 회원 초기 포인트 : ");
		int point = sc.nextInt();

		switch (grade) {
		case 1:
			g[index++] = new Silver(name, "Silver", point);
			break;
		case 2:
			g[index++] = new Gold(name, "Gold", point);
			break;
		case 3:
			g[index++] = new Vip(name, "Vip", point);
			break;
		}

		System.out.println("회원 정보 입력 완료 !!!");

	}

	@Override
	public void memberModifyData() {
		System.out.println("========= 회원 정보 수정 ==========");
		int searchIndex = searchMember();
		System.out.println("회원정보 : " + g[searchIndex].getName() + "/" + g[searchIndex].getGrade() + "/"
				+ g[searchIndex].getPoint());

		System.out.println("1. 이름 수정");
		System.out.println("2. 등급 수정");
		System.out.println("3. 점수 수정");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.print("변경할 이름 입력 : ");
			g[searchIndex].setName(sc.next());
			break;
		case 2:
			System.out.print("변경할 등급 입력(1.Silver/2.Gold/3.Vip) : ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				g[searchIndex] = new Silver(g[searchIndex].getName(), "Silver", g[searchIndex].getPoint());
				break;

			case 2:
				g[searchIndex] = new Gold(g[searchIndex].getName(), "Gold", g[searchIndex].getPoint());
				break;

			case 3:
				g[searchIndex] = new Vip(g[searchIndex].getName(), "Vip", g[searchIndex].getPoint());
				break;
			}
			break;
		case 3:
			System.out.print("변경할 점수 입력 : ");
			g[searchIndex].setPoint(sc.nextInt());
			break;

		}

	}

	@Override
	public void memberAllPrintData() {
		System.out.println("========= 전체 회원 정보 ==========");
		System.out.println("이름 \t\t 등급 \t\t 포인트 \t\t 이자포인트 ");
		for (int i = 0; i < index; i++) {
			System.out.println(g[i].getName() + " \t\t " + g[i].getGrade() + " \t\t " + g[i].getPoint() + "\t\t "
					+ g[i].getInterest());
		}

	}

	@Override
	public void memberDeleteData() {
		System.out.println("========= 삭제 화면 =========");
		int searchIndex = searchMember();
		if (searchIndex == -1) {
			System.out.println("찾는 회원이 없습니다.");
		} else {
			/*index와 g.length는 1부터 시작하고
			searchIndex는 0부터 시작하기 때문에 등호가 없거나 1을 뺴줘야 함
			index는 들어있는 정보의 수를 카운트해주고 
			g.length */ 
			while (searchIndex < index) {
				if (searchIndex == (g.length - 1))break;
				
				g[searchIndex] = g[searchIndex + 1];
				searchIndex++;
			}
			g[searchIndex] = null;
			index--;

		}
	}

	@Override
	public int searchMember() {
		System.out.print("회원 이름 입력 : ");
		String name = sc.next();
		for (int i = 0; i < index; i++) {
			if (g[i].getName().equals(name)) {
				
				return i; // i값은 찾은 객체의 인덱스 번호
			}
		}
		return -1;
	}

}
