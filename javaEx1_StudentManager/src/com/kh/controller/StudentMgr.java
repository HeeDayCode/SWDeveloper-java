package com.kh.controller;

import java.util.Scanner;

import com.kh.vo.Student;

public class StudentMgr {
	Student s; // 자기 멤버에 들어있는 변수는 다 this를 써주는 것이 맞다 //여러 개의 메소드에서 사용이 되는 것을 밖으로 빼고 사용
	Scanner sc = new Scanner(System.in);

	public void start() { // 기본 실행 메소드
		int select; // 해당 메소드에서만 쓰는 변수는 굳이 뺄 필요는 없음 //선택번호
		while (true) {
			System.out.println("학생관리 프로그램");
			System.out.println("1.학생 정보 입력");
			System.out.println("2.학생 정보 출력");
			System.out.println("3.학생 정보 삭제");
			System.out.println("4.학생 정보 수정");
			System.out.println("0.프로그램 종료");
			System.out.print("선택:");
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
			case 4:
				studentUpdate();
				break;
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				return;
			}
		}
	}

	public void studentInsert() {
		if (this.s == null) {
			this.s = new Student(); /// 이거
			System.out.print("이름:");
			this.s.setName(sc.next());
			System.out.print("학번:");
			this.s.setId(sc.next());
			System.out.print("나이:");
			this.s.setAge(sc.nextInt());
			System.out.print("폰번호:");
			this.s.setPhone(sc.next());
			System.out.print("성별:");
			this.s.setGender(sc.next());
		} else {
			System.out.println("이미 학생 정보가 있습니다.");
		}
	}

	public void studentPrint() {
		if (this.s == null) {
			System.out.println("출력할 학생 정보가 없습니다.");
		} else {
			System.out.println("이름 \t 학번 \t 나이 \t 폰번호 \t 성별");
			System.out.println(this.s.getName() + "\t" + this.s.getId() + "\t" + this.s.getAge() + "\t"
					+ this.s.getPhone() + "\t" + this.s.getGender());
		}
	}

	public void studentDelete() {
		if (this.s == null) {
			System.out.println("삭제할 학생의 정보가 없습니다.");
		} else {
			this.s = null;
			System.out.println("학생정보가 삭제되었습니다.");
		}
	}

	public void studentUpdate() {
		if (this.s == null) {
			System.out.println("수정할 학생 정보가 없습니다.");
		} else {
			System.out.println("학생 정보 수정");
			System.out.println("1.이름 수정");
			System.out.println("2.학번 수정");
			System.out.println("3.나이 수정");
			System.out.println("4.폰번호 수정");
			System.out.println("5.성별 수정");
			System.out.println("0.돌아가기");
			System.out.print("선택: ");
			int select;
			select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.print("이름:");
				this.s.setName(sc.next());
				break;
			case 2:
				System.out.print("학번:");
				this.s.setId(sc.next());
				break;
			case 3:
				System.out.print("나이:");
				this.s.setAge(sc.nextInt());
				break;
			case 4:
				System.out.print("폰번호:");
				this.s.setPhone(sc.next());
				break;
			case 5:
				System.out.print("성별:");
				this.s.setGender(sc.next());
				break;
			case 0:
				System.out.println("기본페이지로 돌아왔습니다.");
				return;
			}
		}
	}

}
