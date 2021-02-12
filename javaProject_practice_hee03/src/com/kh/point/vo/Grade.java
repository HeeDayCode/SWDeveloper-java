package com.kh.point.vo;
//추상클래스 객체화불가
public abstract class Grade {
	protected String name;
	protected String grade;
	protected int point;
	
	public Grade() {}
	public Grade(String name, String grade, int point){
		this.name=name;
		this.grade=grade;
		this.point=point;		
	}	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getName() {
		return this.name;
	}
	public String getGrade() {
		return this.grade;
	}
	public int getPoint() {
		return this.point;
	}
	public abstract double getInterest();
}
