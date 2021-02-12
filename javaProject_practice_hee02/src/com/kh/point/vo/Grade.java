package com.kh.point.vo;

public class Grade {
	protected String name;
	protected String grade;
	protected int point;
	protected double interest;	
	public Grade() {}
	public Grade(String name, String grade, int point, double interest){
		this.name=name;
		this.grade=grade;
		this.point=point;
		this.interest=interest;
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
	public double getInterest() {
		return this.interest;
	}
}