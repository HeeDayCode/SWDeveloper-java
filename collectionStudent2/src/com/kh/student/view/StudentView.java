package com.kh.student.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.student.controller.StudentController;
import com.kh.student.model.vo.Student;

public class StudentView {
	private Scanner sc = new Scanner(System.in);
	private StudentController sCon = new StudentController(); // controller와 연결
	

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
				System.out.print("학번 입력:");
				selectOne(sc.nextInt());
				break;
			case 3:
				insertStudent();
				break;
			case 4:
				updateStudent();
				break;
			case 5:
				break;
			case 0:
				return;

			}
		}
	}

	public void selectAll() {
		ArrayList<Student> list =sCon.selectAll();
		System.out.println("학번 / 이름 / 나이 / 주소 / 학점");
		/*for(int i = 0; i<list.size();i++) {		
		System.out.println(list.get(i).getClassNumber()+"/"+list.get(i).getName()+"/"+ 
				list.get(i).getAge()+"/"+list.get(i).getAddress()+"/"+list.get(i).getGrade()
				);			
		}*/
		for(Student i : list)
		{
			System.out.println(i.getClassNumber()+"/"+i.getName()+"/"+
					i.getAge()+"/"+i.getAddress()+"/"+i.getGrade()
					);	
		}	
	}

	public void selectOne(int classNumber) {
		Student i = sCon.selectOne(classNumber);
		/*System.out.println(sCon.selectOne(classNumber).getClassNumber()+"/"+sCon.selectOne(classNumber).getName()+"/"+
				sCon.selectOne(classNumber).getAge()+"/"+sCon.selectOne(classNumber).getAddress()+"/"+sCon.selectOne(classNumber).getGrade()
				);	*/
		System.out.println(i.getClassNumber()+"/"+i.getName()+"/"+
				i.getAge()+"/"+i.getAddress()+"/"+i.getGrade()
				);
	}

	public void insertStudent() {		
		//학생 정보 입력 // 학번 이름 나이 주소 학점
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

		boolean result = sCon.insertStudent(vo); //학생정보를 DB(Controller클래스의  ArrayList)에 저장하기 위한 용도
		if(result == true) {
			System.out.println("학생정보 입력이 완료되었습니다.");
		}else {
			System.out.println("학생정보 입력이 실패하였습니다.");
			System.out.println("지속적으로 실패시 관리자에게 문의해주세요.");
		}
	}

	public void updateStudent() {
		System.out.print("학번 입력:");
		Student i = sCon.selectOne(sc.nextInt());
		System.out.println("------------ 수정할 내용들 -----------");	
		System.out.print("학생 학번 입력:");
		i.setClassNumber(sc.nextInt());
		System.out.print("학생 이름 입력:");
		i.setName(sc.next());
		System.out.print("학생 나이 입력:");
		i.setAge(sc.nextInt());
		System.out.print("학생 주소 입력:");
		i.setAddress(sc.next());
		System.out.print("학생 학점 입력:");
		i.setGrade(sc.nextDouble());	
	}

	public void deleteStudent() {
		System.out.print("학번 입력:");
		Student i = sCon.selectOne(sc.nextInt());
		
		
		
	}
}
