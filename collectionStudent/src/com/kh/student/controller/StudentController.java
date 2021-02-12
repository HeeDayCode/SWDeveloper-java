package com.kh.student.controller;

import java.util.ArrayList;

import com.kh.student.model.vo.Student;

public class StudentController {
	private ArrayList<Student> list = new ArrayList<Student>(); // DB처럼 사용
	//private ArrayList list = new ArrayList(); 안쓰면 Object 객체의 형태가 되고 다운 캐스팅을 계속하기가 힘드니까
	
	public ArrayList<Student> selectAll() {
		ArrayList<Student> copyList = new ArrayList<Student>(list); //복사본을 줌으로써 원본이 수정되지 않도록 만든다
		return copyList;
	}

	public Student selectOne(int classNumber) {
		//Student vo; 지역변수를 초기화 하지 않고 그냥 쓰면 쓰레기 값이 들어가 있음 
		//Student vo=null;을 넣으면 return vo;를 해도 오류가 나지 않는다.
		for (int i = 0; i < list.size(); i++) {
			if (classNumber == list.get(i).getClassNumber()) {
				return list.get(i);
			}
		}
		return null; //
	}

	public Boolean insertStudent(Student s) { //처리가 잘 되었다면 알 수 있게 표현을 해주는 코드가 좋은 코드 //사용자는 view만 볼 수있으니 값을 전달
		boolean result = list.add(s);
		return result;
	}

	public Boolean updateStudent(int classNumber, Student newStudent) {
		//boolean result=false;
		for (int i = 0; i < list.size(); i++) {
			if (classNumber == list.get(i).getClassNumber()) {
				list.set(i, newStudent);
				return true;
			}
		}
		return false;
	}

	public Boolean deleteStudent(int classNumber) {
		for (int i = 0; i < list.size(); i++) {
			if (classNumber == list.get(i).getClassNumber()) {
				list.remove(i); //break; 코드가 헛돌지 않도록 만들어주기
				return true;
			}
		}
		return false;
	}
}
