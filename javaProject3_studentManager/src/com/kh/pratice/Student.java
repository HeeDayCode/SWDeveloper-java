package com.kh.pratice;
public class Student {
	
	private String name; //이름
	private String id; //학생 학번
	private int age; //학생 나이
	private String phone; //학생 번호
	private String gender; //성별
	
	public void setName(String name){this.name=name;}
	public void setId(String id){this.id=id;}
	public void setAge(int age){this.age=age;}
	public void setPhone(String phone){this.phone=phone;}
	public void setGender(String gender){this.gender=gender;}
	
	public String getName() {return this.name;} 
	public String getId() {return this.id;}
	public int getAge() {return this.age;}
	public String getPhone() {return this.phone;}	
	public String getGender() {return this.gender;}

	
}
