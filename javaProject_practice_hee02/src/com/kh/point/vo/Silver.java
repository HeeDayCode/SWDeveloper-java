package com.kh.point.vo;
public class Silver extends Grade{	
	public Silver(){}
	public Silver(String name, String grade, int point){
		super(name,grade,point,point*0.02);
	}
}