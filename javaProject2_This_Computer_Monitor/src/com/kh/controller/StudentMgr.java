package com.kh.controller;

import java.util.Scanner;

import com.kh.vo.Student;

public class StudentMgr { // f3 controller class의 역할
	Student s; //레퍼런스만 만들고 객체는 만들지않음
	Scanner sc = new Scanner(System.in);

	public void start() // 클래스 시작 메소드
	{
		while (true) {
			int select;
			System.out.println("======== 학생 관리 프로그램 ver 1.0 ========");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 출력");
			System.out.println("3. 학생 정보 삭제");
			System.out.println("0. 학생 관리 프로그램 종료");
			System.out.print("선택: ");
			select = sc.nextInt();

			switch (select) {
			case 1:
				studentInsert();
				break;
			case 2:
				stdentPrint();
				break;
			case 3:
				studentDelete();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;

			}
		}
	}

	public void studentInsert() // 핵심정보입력 메소드
	{
		if (s != null) {
			System.out.println("이미 학생 정보가 있습니다.");
		} else {
			s = new Student(); //객체를 레퍼런스와 이어준다
			System.out.println("===========학생 정보 입력==========");
			System.out.print("학생 이름:");
			s.setName(sc.next());
			System.out.print("학생 학번:");
			s.setId(sc.next());
			System.out.print("학생 나이:");
			s.setAge(sc.nextInt());
			System.out.print("학생 핸드폰 번호:");
			s.setPhone(sc.next());
			System.out.print("학생 성별:");
			s.setGender(sc.next());

			System.out.println("학생 정보 입력이 끝났습니다.");
		}
	}

	public void stdentPrint() // 학생 정보 출력
	{
		if (s == null) {
			System.out.println("학생의 정보가 없습니다.");
		} else {
			System.out.println("===========학생 정보 출력=======");
			System.out.println("이름 \t 학번 \t 나이 \t 핸드폰 번호  \t 성별");
			System.out.println(
					s.getName() + "\t" + s.getId() + "\t" + s.getAge() + "\t" + s.getPhone() + "\t" + s.getGender());
		}

	}

	public void studentDelete() // 학생정보 삭제 메소드
	{
		s = null;
		System.out.println("학생 정보가 삭제 되었습니다.");
	}

}
