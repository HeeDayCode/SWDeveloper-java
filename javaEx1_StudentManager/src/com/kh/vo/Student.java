package com.kh.vo;

public class Student {
	private String name;
	private String id;
	private int age;
	private String phone;
	private String gender; //들어가는 거 나가는 거 
	
	public void setName(String name) {this.name=name;}
	public void setId(String id) {this.id=id;}
	public void setAge(int age) {this.age=age;}
	public void setPhone(String phone) {this.phone=phone;}
	public void setGender(String gender) {this.gender=gender;}
	
	public String getName() {return this.name;}
	public String getId() {return this.id;}
	public int getAge() {return this.age;}
	public String getPhone() {return this.phone;}
	public String getGender() {return this.gender;}	
}
