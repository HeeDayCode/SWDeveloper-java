package com.kh.test;

public class Monitor {
	//클래스
	//속성 변수 기능 메소드
	//클래스 안의 변수 멤버변수 멤버 메소드
	
	//속성
	String modelName; //모델명
	String productName; //제품명
	int price; //가격
	String color; //색상
	boolean powerSwitch=false; // true on false off
	
	//기능
	public void monitorInfoSetting(String _modelName, String _productName, int _price, String _color)
	{
		modelName = _modelName;
		productName = _productName;
		price = _price;
		color = _color;
	}
	
	public void moniterPrint(String str)
	{
		System.out.println("모니터 출력:" + str);
	}
	
	public void monitorPowerOn()
	{
		if(powerSwitch == false) 
		{
			powerSwitch = true;
			System.out.println("모니터가 켜졌습니다. (ON)");
		}else if(powerSwitch == true)
		{
			System.out.println("이미 켜져 있는 상태입니다.");
		}
		
	}
	
	public void monitorPowerOff()
	{
		if(powerSwitch == false) //기존 off
		{		
			System.out.println("이미 꺼져 있는 상태입니다.");
		}else if(powerSwitch == true) //기존 on
		{
			powerSwitch = false;
			System.out.println("모니터가 꺼졌습니다. (OFF)");
		}	
	}
	
	public void monitorInfoPrint()
	{
		System.out.println("======== 모니터 사양 정보 ========");
		System.out.println("모델명 \t 제품명 \t 가격 \t 색상");
		System.out.println(modelName + "\t" + productName + "\t" + price + "\t" + color );
	}
}






