package com.kh.test;

public class Monitor {
	//Ŭ����
	//�Ӽ� ���� ��� �޼ҵ�
	//Ŭ���� ���� ���� ������� ��� �޼ҵ�
	
	//�Ӽ�
	String modelName; //�𵨸�
	String productName; //��ǰ��
	int price; //����
	String color; //����
	boolean powerSwitch=false; // true on false off
	
	//���
	public void monitorInfoSetting(String _modelName, String _productName, int _price, String _color)
	{
		modelName = _modelName;
		productName = _productName;
		price = _price;
		color = _color;
	}
	
	public void moniterPrint(String str)
	{
		System.out.println("����� ���:" + str);
	}
	
	public void monitorPowerOn()
	{
		if(powerSwitch == false) 
		{
			powerSwitch = true;
			System.out.println("����Ͱ� �������ϴ�. (ON)");
		}else if(powerSwitch == true)
		{
			System.out.println("�̹� ���� �ִ� �����Դϴ�.");
		}
		
	}
	
	public void monitorPowerOff()
	{
		if(powerSwitch == false) //���� off
		{		
			System.out.println("�̹� ���� �ִ� �����Դϴ�.");
		}else if(powerSwitch == true) //���� on
		{
			powerSwitch = false;
			System.out.println("����Ͱ� �������ϴ�. (OFF)");
		}	
	}
	
	public void monitorInfoPrint()
	{
		System.out.println("======== ����� ��� ���� ========");
		System.out.println("�𵨸� \t ��ǰ�� \t ���� \t ����");
		System.out.println(modelName + "\t" + productName + "\t" + price + "\t" + color );
	}
}






