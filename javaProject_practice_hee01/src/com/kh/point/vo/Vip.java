package com.kh.point.vo;

public class Vip {	
	private String name; 
	private String grade; 
	private int point; 	
	public Vip(){}
	public Vip(String name, String grade, int point){
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
		return name;
	}
	public String getGrade() {
		return grade;
	}
	public int getPoint() {
		return point;
	}
	public double getInterest() {
		return point*0.05;
	}
}