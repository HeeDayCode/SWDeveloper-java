package com.kh.point.controller;

import java.util.Scanner;

import com.kh.point.vo.Gold;
import com.kh.point.vo.Grade;
import com.kh.point.vo.Silver;
import com.kh.point.vo.Vip;

public class Pntmgr implements PointMgr {
	private Scanner sc = new Scanner(System.in);
	private Grade[] g = new Grade[30];
	private int index = 0;

	public void start() {
		int select; // 해당 메소드에서만 쓰는 변수는 굳이 뺄 필요는 없음 //선택번호
		while (true) {
			System.out.println("====== 회원 포인트 관리 프로그램 ======");
			System.out.println("1. 회원 정보 입력");
			System.out.println("2. 회원 정보 출력");
			System.out.println("3. 회원 정보 검색");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 정보 삭제");
			System.out.println("6. 회원 정보 전체 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택:");
			select = sc.nextInt();
			switch (select) {
			case 1:
				memberInsertData();
				break;
			case 2:
				memberAllPrintData();
				break;
			case 3:
				if (index == 0) {
					System.out.println("회원 정보가 없습니다.");
				} else {

					/*
					 * System.out.println("========= 회원 정보 출력 =========");
					 * System.out.println("회원 \t\t 등급 \t\t 포인트 \t\t 이자포인트");
					 * System.out.println(searchMember(name).getName() + "\t\t" +
					 * searchMember(name).getGrade() + "\t\t" + searchMember(name).getPoint() +
					 * "\t\t" + searchMember(name).getInterest()); System.out.println();
					 */
				}
				break;
			case 4:
				memberModifyData();
				break;
			case 5:
				memberDeleteData();
				break;
			case 6:
				memberAllDeleteData();
				break;
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				return;
			}
		}

	}

	@Override
	public void memberInsertData() {
		if (index >= g.length) {
			System.out.println("저장 공간이 다찼습니다.");
			System.out.println();
		} else {
			System.out.println("========= 회원 정보 입력 =========");
			System.out.print("회원 이름 입력:");
			String name = sc.next();
			System.out.print("회원 등급 입력:");
			String grade = sc.next();
			System.out.print("회원 포인트 입력:");
			int point = sc.nextInt();

			// 내용이 정해진 부분은 switch 문을 써서 선택을 하도록 도와주는 걸로 입력 하는 거가 더 어렵다
			if (grade.equals("Silver")) {
				g[index++] = new Silver(name, grade, point);
			} else if (grade.equals("Gold")) {
				g[index++] = new Gold(name, grade, point);
			} else if (grade.equals("Vip")) {
				g[index++] = new Vip(name, grade, point);
			}
			System.out.println("회원 정보 입력이 완료되었습니다.");
			System.out.println();
		}
	}

	@Override
	public void memberModifyData() {
		if (index == 0) {
			System.out.println("회원 정보가 없습니다.");
			System.out.println();
		} else {
			System.out.println("회원 수정 페이지");
			System.out.print("수정 회원 이름 입력:");
			String search_name = sc.next();
			for (int i = 0; i < index; i++) {
				if (search_name.equals(this.g[i].getName())) {
					System.out.println("========= 회원 수정 입력 =========");
					System.out.print("회원 이름 입력:");
					this.g[i].setName(sc.next());
					System.out.print("회원 등급 입력:");
					this.g[i].setGrade(sc.next());
					//등급과 관련된 내용이 있는 경우 다시 넣어주기
					System.out.print("회원 포인트 입력:");
					this.g[i].setPoint(sc.nextInt());
					System.out.println("회원 정보 수정이 완료되었습니다.");
					System.out.println();
				}
			}
		}
	}

	@Override
	public void memberAllPrintData() {
		if (index == 0) {
			System.out.println("회원 정보가 없습니다.");
		} else {
			System.out.println("========= 전체 회원 정보 =========");
			System.out.println("회원 \t\t 등급 \t\t 포인트 \t\t 이자포인트");
			for (int i = 0; i < index; i++) {
				System.out.println(this.g[i].getName() + "\t\t" + this.g[i].getGrade() + "\t\t" + this.g[i].getPoint()
						+ "\t\t" + this.g[i].getInterest());
			}
			System.out.println();
		}
	}

	@Override
	public void memberDeleteData() {
		int k = 0;
		if (index == 0) {
			System.out.println("회원 정보가 없습니다.");
		} else {
			System.out.println("======== 회원 삭제 화면 ========");
			Grade tmpGrade = searchMember();
			System.out.println("검색된 회원정보: " + tmpGrade.getName());
			System.out.println("정말 삭제하시겠습니까? (y/n)");
			char choice = sc.next().charAt(0);
			if (choice == 'y') {
				for (int i = 0; i < index; i++) {
					if (tmpGrade.equals(g[i])) {
						int j = i;
						while (g[j] != null) {
							// index 사람수
							if (j + 1 == index) {
								g[j] = null;
								index--; //어차피 이순간은 꼭나오는 경우 이니깐 여기서 index를 줄려준다
								break;
							}
							g[j] = g[j + 1];
							j++;
						}
					}
				}
			}else {
				System.out.println("삭제를 취소합니다.");
			}

			/*
			 * for (int i = 0; i < index; i++) { if
			 * (search_name.equals(this.g[i].getName())) {
			 * 
			 * this.g[i] = null; index--; k = i; while (g[k + 1] == null) { g[k] = g[k + 1];
			 * // null의 주소값은 알 수가 없으니까 땡겨주기 } } }
			 */
		}

		System.out.println("회원 정보 삭제가 완료되었습니다.");
		System.out.println();
	}

	@Override
	public Grade searchMember() {
		System.out.print("회원 이름 입력:");
		String search_name = sc.next();
		int searchIndex = 0;
		// Grade new_g = null;
		for (int i = 0; i < index; i++) {
			if (g[i].getName().equals(search_name)) {
				searchIndex = i;
				// new_g = g[i];
				break;
			}
		}
		//return new_g;
		return g[searchIndex];
	}

	public void memberAllDeleteData() {
		if (index == 0) {
			System.out.println("회원 정보가 없습니다.");
		} else {
			for (int i = 0; i < g.length; i++) {
				g[i] = null;
			}
			index = 0;
			System.out.println("모든 회원 정보가 삭제 되었습니다.");
			System.out.println();
		}
	}
}