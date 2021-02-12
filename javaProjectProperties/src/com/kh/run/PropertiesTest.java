package com.kh.run;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public void start()
	{
		Properties prop = new Properties();
		
		try {
			prop.load(new FileReader("resources/version.Properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String os =prop.getProperty("OS");
		//String os ="Windows XP";  �̷��� ���� ���ִ� ���� �ϵ��ڵ��̶�� ��
		
		if(os.equals("Windows XP"))
		{
			System.out.println("�ȳ��ϼ��� ���� Windows XP �Դϴ�");
		}else if(os.equals("Windows 7"))
		{
			System.out.println("�ȳ��ϼ��� ���� Windows 7 �Դϴ�");
		}else if(os.equals("Windows 10"))
		{
			System.out.println("�ȳ��ϼ��� ���� Windows 10 �Դϴ�");
			System.out.println("�ֽŹ����Դϴ�.");
		}else {
			System.out.println("����?");
		}
		
	}

}
