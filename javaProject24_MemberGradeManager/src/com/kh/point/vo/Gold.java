package com.kh.point.vo;

public class Gold extends Grade {
	public Gold(){}
	public Gold(String name, String grade, int point){
		super(name,grade,point);	
	}
	@Override
	public double getInterest() {		
		return this.point*0.03;
	}
}
