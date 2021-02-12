package com.kh.controller;

import java.util.Scanner;

import com.kh.vo.Student;

public class StudentMgr {
	private Student[] s = new Student[10];
	private Scanner sc = new Scanner(System.in);
	private int index = 0;

	public void start() {
		while (true) {
			System.out.println("===== 학생 관리 매니저 ver1.0 =====");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 출력");
			System.out.println("3. 학생 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택: ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				studentInsert();
				break;
			case 2:
				studentPrint();
				break;
			case 3:
				studentDelete();
				break;
			case 0:
				System.out.println("종료 되었습니다.");
				return;
			}
		}
	}
	private void studentInsert() {
		if(index>=s.length) {
			System.out.println("저장 공간이 다찼습니다.");
		}else {
		System.out.println("====== 학생 정보 입력 ======");
		System.out.print("학생 이름 입력:");
		String name = sc.next();
		System.out.print("학생 나이 입력:");
		int age = sc.nextInt();
		System.out.print("학생 성별 입력:");
		String gender = sc.next();
		s[index++] = new Student(name, age, gender);
		System.out.println("학생 정보 입력이 완료되었습니다.");
		}
	}
	
	private void studentPrint() {
		if (index == 0) {
			System.out.println("출력할 학생 정보가 없습니다.");
		} else {
			System.out.println("☆☆☆☆☆☆☆☆ 학생 정보 출력 ☆☆☆☆☆☆☆☆");
			System.out.println("이름 \t\t 나이 \t\t 성별");
			for (int i = 0; i < index; i++) {
				System.out.println(s[i].getName() + "\t\t" + s[i].getAge() + "\t\t" + s[i].getGender());
			}
		}
	}
	private void studentDelete() {
		for (int i = 0; i < s.length; i++) {
			s[i] = null;
		}
		index = 0;
		System.out.println("모든 학생 정보가 삭제 되었습니다.");
	}
}
