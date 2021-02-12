package com.kh.ex;

import java.util.Scanner;

public class StudentMgr {
	Student[] s = new Student[3];
	Scanner sc = new Scanner(System.in);

	public void start() 
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
				studentPrint();
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

	public void studentInsert() {
		System.out.println("===========학생 정보 입력==========");
		for (int i = 0; i < this.s.length; i++) {
			this.s[i] = new Student();
			System.out.print((i + 1) + "번 학생 이름:");
			this.s[i].setName(sc.next());
			System.out.print((i + 1) + "번 학생 학번:");
			this.s[i].setId(sc.next());
			System.out.print((i + 1) + "번 학생 나이:");
			this.s[i].setAge(sc.nextInt());
			System.out.print((i + 1) + "번 학생 핸드폰 번호:");
			this.s[i].setPhone(sc.next());
			System.out.print((i + 1) + "번 학생 성별:");
			this.s[i].setGender(sc.next());
			System.out.println();
		}
		System.out.println("학생 정보 입력이 완료되었습니다.");
	}

	public void studentPrint() {
		if (this.s[0] == null || this.s[1] == null || this.s[2] == null) {
			System.out.println("출력할 학생 정보가 없습니다.");
		} else {
			System.out.println("===========학생 정보 출력=======");
			System.out.println("이름 \t 학번 \t 나이 \t 핸드폰 번호 \t 성별");
			for (int i = 0; i < this.s.length; i++) {
				System.out.println(s[i].getName() + "\t" + s[i].getId() + "\t" + s[i].getAge() + "\t" + s[i].getPhone()
						+ "\t" + s[i].getGender());
			}
		}
	}

	public void studentDelete() {
		if (this.s[0] == null || this.s[1] == null || this.s[2] == null) {
			System.out.println("삭제할 학생 정보가 없습니다.");
		} else {
			this.s = null;
			System.out.println("학생 정보가 삭제 되었습니다.");
			this.s = new Student[3];
		}
	}
}