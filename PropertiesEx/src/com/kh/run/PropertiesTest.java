package com.kh.run;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

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
		
		String os =prop.getProperty("user");
		//String os ="Windows XP";  �̷��� ���� ���ִ� ���� �ϵ��ڵ��̶�� ��

		char[] arrChar = os.toCharArray();
		String position = new String(arrChar, 1, 2);	
		//System.out.println(change);
		if(position.equals("���"))
		{
			System.out.println("========= "+os+"�� �ȳ��ϼ��� =========");
			System.out.println("1. ��������");
			System.out.println("2. �޽���");
		}else if(position.equals("����"))
		{
			System.out.println("========= "+os+"�� �ȳ��ϼ��� =========");
			System.out.println("1. ��������");
			System.out.println("2. �޽���");
			System.out.println("3. ���� ����");
			System.out.println("4. �ֽ� �ϱ�");
		}
		
	}

}
