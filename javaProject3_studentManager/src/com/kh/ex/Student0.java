package com.kh.ex;

//vo Ŭ����
public class Student0 {
	
	private String name; //�̸�
	private String id; //�л� �й�
	private int age; //�л� ����
	private String phone; //�л� ��ȣ
	private String gender; //����
	//_�Ű�����(�Ѿ���� ������) �� ������� ���� .�ڿ� ������ ��õ �޼ҵ�
	
	public Student0(String name) {
		this.name=name;
		
	}
	
	
	
	
	public void setName(String name)
	{this.name=name;
	//this. ���ڽ� ������� ���� �׳� name �Ű�����
	}
	public void setId(String id){this.id=id;}
	public void setAge(int age){this.age=age;}
	public void setPhone(String phone){this.phone=phone;}
	public void setGender(String gender){this.gender=gender;}
	
	public String getName() {return this.name;} //name ������ ����� �� ������ �� �� ��Ȯ�ϰ�
	public String getId() {return this.id;}
	public int getAge() {return this.age;}
	public String getPhone() {return this.phone;}	
	public String getGender() {return this.gender;}

	
}
