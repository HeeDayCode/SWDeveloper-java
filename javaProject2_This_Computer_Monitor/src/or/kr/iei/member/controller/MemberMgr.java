package or.kr.iei.member.controller;

import java.util.Scanner;

import or.kr.iei.member.vo.Member;

public class MemberMgr {
	Member m;
	Scanner sc = new Scanner(System.in);

	public void start() {
		if (m != null) {
			System.out.println("이미 회원 정보가 있습니다.");
		} else {
			while (true) {
				System.out.println("======회원 관리 프로그램======");
				System.out.println("1. 회원가입");
				System.out.println("2. 회원정보출력");
				System.out.println("3. 회원정보수정");
				System.out.println("4. 회원삭제");
				int select;
				System.out.print("선택: ");
				select = sc.nextInt();

				switch (select) {
				case 1:
					memberInsert();
					break;
				case 2:
					memberPrint();
					break;
				case 3:
					memberUpdate();
					break;
				case 4:
					memberDelete();
					break;

				}
			}
		}
	}

	public void memberInsert() {

		if (m != null) {
			System.out.println("이미 회원정보가 있습니다.");
		} else {
			m = new Member();
			System.out.println("======회원 가입 ======");
			System.out.print("이름:");
			m.setName(sc.next());
			System.out.print("나이:");
			m.setAge(sc.nextInt());
			System.out.print("주소:");
			m.setAddress(sc.next());
			System.out.print("핸드폰 번호:");
			m.setPhone(sc.next());
			System.out.print("성별:");
			m.setGender(sc.next());
		}
	}

	public void memberPrint() {
		if (m == null) {
			System.out.println("회원정보가 없습니다.");
		} else {
			System.out.println("이름 \t 나이 \t 주소 \t 핸드폰 번호 \t 성별");
			System.out.println(m.getName() + "\t" + m.getAge() + "\t" + m.getAddress() + "\t" + m.getPhone() + "\t"
					+ m.getGender());
		}
	}

	public void memberUpdate() {
		// m = new Member();
		if (m == null) {
			System.out.println("등록된 회원 정보가 없습니다.");
		} else {
			System.out.println("======회원 수정======");
			System.out.println("1. 이름 수정");
			System.out.println("2. 나이 수정");
			System.out.println("3. 주소 수정");
			System.out.println("4. 핸드폰 번호 수정");
			System.out.println("5. 성별 수정");
			System.out.print("수정할 부분 선택:");
			int select;
			select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.print("이름:");
				m.setName(sc.next());
				break;
			case 2:
				System.out.print("나이:");
				m.setAge(sc.nextInt());
				break;
			case 3:
				System.out.print("주소:");
				m.setAddress(sc.next());
				break;
			case 4:
				System.out.print("핸드폰 번호:");
				m.setPhone(sc.next());
				break;
			case 5:
				System.out.print("성별:");
				m.setGender(sc.next());
				break;
			}

		}
	}

	public void memberDelete() {
		m = null;
		System.out.println("회원 삭제가 완료 되었습니다.");
	}
}
