package com.kh.student.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.student.controller.StudentController;
import com.kh.student.model.vo.Student;

public class StudentView {
	private Scanner sc = new Scanner(System.in);
	private StudentController sCon = new StudentController(); // controller와 연결
	// StudentController 클래스의 래퍼런스를 만들서 연결을해준다 생각

	public void mainMenu() // 메뉴를 보여주기 위한 메소드
	{
		while (true) {
			System.out.println("-----------학생관리 프로그램----------");
			System.out.println("1. 학생 정보 전체 출력");
			System.out.println("2. 학생 정보 조회(학번)");
			System.out.println("3. 학생 정보 입력");
			System.out.println("4. 학생 정보 변경");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택: ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				selectAll();
				break;
			case 2:
				selectOne();
				break;
			case 3:
				insertStudent();
				break;
			case 4:
				updateStudent();
				break;
			case 5:
				deleteStudent();
				break;
			case 0:
				return;

			}
		}
	}

	public void selectAll() {
		ArrayList<Student> list = sCon.selectAll(); 
		if (list.size() == 0) {
			System.out.println("학생 정보가 없습니다.");
			//return;
			// ????return;
		} else {
			System.out.println("-------------학생 전체 정보 출력 --------------");
			System.out.println("학번 \t 이름 \t 나이 \t 주소 \t\t 학점");
			for (Student vo : list) {
				System.out.println(vo.getClassNumber() + "\t" + vo.getName() + "\t" + vo.getAge() + "\t"
						+ vo.getAddress() + "\t" + vo.getGrade());
				// System.out.println(vo); 위의 내용을 toString을 사용해서 간단하게

			} // 자동으로 리스트의 내용을 다 가져올 때까지
		}
	}

	public void selectOne() {
		//
		System.out.print("조회할 학생의 학번:");
		int classNumber = sc.nextInt();

		if (sCon.selectOne(classNumber) == null) {
			System.out.println("찾는 학생이 없습니다.");
			// try~catch는 예외 상황에서만 쓰도록한다.
		} else {
			Student i = sCon.selectOne(classNumber);
			System.out.println("학번 \t 이름 \t 나이 \t 주소 \t\t 학점");
			System.out.println(i.getClassNumber() + "\t" + i.getName() + "\t" + i.getAge() + "\t" + i.getAddress()
					+ "\t" + i.getGrade());
			// System.out.println(i);
		}
	}

	public void insertStudent() { // 레퍼런스 이름은 알아서
		Student vo = new Student();
		System.out.print("학생 학번 입력:");
		vo.setClassNumber(sc.nextInt());
		System.out.print("학생 이름 입력:");
		vo.setName(sc.next());
		System.out.print("학생 나이 입력:");
		vo.setAge(sc.nextInt());
		System.out.print("학생 주소 입력:");
		vo.setAddress(sc.next());
		System.out.print("학생 학점 입력:");
		vo.setGrade(sc.nextDouble());

		// boolean result = ; // 학생정보를 DB(Controller클래스의 ArrayList)에 저장하기 위한 용도 //이름은
		// 같지만 다른 곳의 메소드// 파라미터 매개변수
		if (sCon.insertStudent(vo) == true) {
			System.out.println("학생정보 입력이 완료되었습니다.");
		} else {
			System.out.println("학생정보 입력이 실패하였습니다.");
			System.out.println("지속적으로 실패시 관리자에게 문의해주세요.");
		}
	}

	public void updateStudent() {
		System.out.print("학번 입력:");
		int classNumber = sc.nextInt();
		Student vo = sCon.selectOne(classNumber);
		if (vo == null) {
			System.out.println("찾는 학생이 없습니다.");
		} else {
			System.out.println("------------ 수정할 학생 정보 -----------");
			System.out.println(vo);
			// while (true) {

			System.out.println("------------ 수정할 내용들 -----------");
			// System.out.println("1. 학생 학번 수정");
			/*
			 * System.out.println("1. 학생 이름 수정"); System.out.println("2. 학생 나이 수정");
			 * System.out.println("3. 학생 주소 수정"); System.out.println("4. 학생 학점 수정");
			 * System.out.println("0. 돌아가기"); System.out.print("선택:"); int select =
			 * sc.nextInt();
			 */

			Student newVo = new Student();
			newVo.setClassNumber(classNumber);
			System.out.print("학생 이름 입력:");
			newVo.setName(sc.next());
			System.out.print("학생 나이 입력:");
			newVo.setAge(sc.nextInt());
			System.out.print("학생 주소 입력:");
			newVo.setAddress(sc.next());
			System.out.print("학생 학점 입력:");
			newVo.setGrade(sc.nextDouble());

			/*
			 * switch (select) {
			 * 
			 * case 1: System.out.print("학생 이름 입력:"); newVo.setName(sc.next()); break; case
			 * 2: System.out.print("학생 나이 입력:"); newVo.setAge(sc.nextInt()); break; case 3:
			 * System.out.print("학생 주소 입력:"); newVo.setAddress(sc.next()); break; case 4:
			 * System.out.print("학생 학점 입력:"); newVo.setGrade(sc.nextDouble()); break; case
			 * 0: return; }
			 */

			//boolean result = sCon.updateStudent(classNumber, newVo); // 학생정보를 DB(Controller클래스의 ArrayList)에 저장하기 위한 용도
			if (sCon.updateStudent(classNumber, newVo) == true) {
				System.out.println("학생정보 수정이 완료되었습니다.");
			} else {
				System.out.println("학생정보 수정이 실패하였습니다.");
				System.out.println("지속적으로 실패시 관리자에게 문의해주세요.");
			}
		}
	}
	// }

	public void deleteStudent() {
		System.out.println("1.전체삭제");
		System.out.println("2.검색삭제");
		
		
		System.out.print("학번 입력:");
		//boolean result = sCon.deleteStudent(sc.nextInt());
		if (sCon.deleteStudent(sc.nextInt()) == true) {
			System.out.println("학생정보 삭제가 완료되었습니다.");
		} else {
			System.out.println("학생정보 삭제를 실패하였습니다.");
			System.out.println("지속적으로 실패시 관리자에게 문의해주세요.");
		}
	}
}
