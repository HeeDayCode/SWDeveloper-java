package com.kh.student.controller;

import java.util.ArrayList;

import com.kh.student.model.vo.Student;

public class StudentController {
	private ArrayList<Student> list = new ArrayList<Student>(); //DB처럼 사용
	
	
	public ArrayList<Student> selectAll() {				
		return list;		
	} 				// 학생 전체 조회 메소드
	
	public Student selectOne(int classNumber)  {	
		for(int i = 0; i<list.size();i++) {		
			if(classNumber == list.get(i).getClassNumber())
			{
				return list.get(i);			
			}	
		}
		return null;		
	}				// 학생 한명 조회 메소드
	public Boolean insertStudent(Student s)  {
		boolean result = list.add(s); //성공되면 true boolean 타입
		return result;
	} //f3정보가 넘어왔네	
	//학생 입력 메소드

	public Boolean updateStudent(int classNumber, Student newStudent) {
		
		return false;
	}	// 학생 정보 변경 메소드
	public Boolean deleteStudent(int classNumber)  	{
		
		return false;
	}			// 학생 정보 삭제 메소드

	
	
}
