package com.kh.pratice;

import java.util.Scanner;

public class StudentMgr {
	int index = 0;
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
		if(index>this.s.length) {
			System.out.println("학생 정보 공간이 가득찼습니다.");			
		}else {
			System.out.println("===========학생 정보 입력==========");		
			this.s[index] = new Student();
			System.out.print((index + 1) + "번 학생 이름:");
			this.s[index].setName(sc.next());
			System.out.print((index + 1) + "번 학생 학번:");
			this.s[index].setId(sc.next());
			System.out.print((index + 1) + "번 학생 나이:");
			this.s[index].setAge(sc.nextInt());
			System.out.print((index + 1) + "번 학생 핸드폰 번호:");
			this.s[index].setPhone(sc.next());
			System.out.print((index + 1) + "번 학생 성별:");
			this.s[index].setGender(sc.next());
			System.out.println((index + 1) + "번 학생 정보 입력이 완료되었습니다.");
			System.out.println();
			this.index++;
		}	
	}

	public void studentPrint() {
		if (this.s[0] == null || this.s[1] == null || this.s[2] == null) {
			System.out.println("출력할 학생 정보가 없습니다.");
		} else {
			System.out.println("===========학생 정보 출력=======");
			System.out.println("이름 \t 학번 \t 나이 \t 핸드폰 번호 \t 성별");
			for (int i = 0; i < index; i++) {
				System.out.println(s[i].getName() + "\t" + s[i].getId() + "\t" + s[i].getAge() + "\t" + s[i].getPhone()
						+ "\t" + s[i].getGender());
			}
		}
	}

	public void studentDelete() { //index==0 리셋
		if (this.s[0] == null || this.s[1] == null || this.s[2] == null) {
			System.out.println("삭제할 학생 정보가 없습니다.");
		} else {
			this.s = null;
			System.out.println("학생 정보가 삭제 되었습니다.");
			this.s = new Student[3];
		}
	}
}