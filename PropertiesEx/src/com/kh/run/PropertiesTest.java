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
		//String os ="Windows XP";  이렇게 직접 써주는 것을 하드코딩이라고 함

		char[] arrChar = os.toCharArray();
		String position = new String(arrChar, 1, 2);	
		//System.out.println(change);
		if(position.equals("사원"))
		{
			System.out.println("========= "+os+"님 안녕하세요 =========");
			System.out.println("1. 파일정리");
			System.out.println("2. 메신저");
		}else if(position.equals("부장"))
		{
			System.out.println("========= "+os+"님 안녕하세요 =========");
			System.out.println("1. 파일정리");
			System.out.println("2. 메신저");
			System.out.println("3. 직원 관리");
			System.out.println("4. 주식 하기");
		}
		
	}

}
