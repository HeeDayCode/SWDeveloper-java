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
		//String os ="Windows XP";  이렇게 직접 써주는 것을 하드코딩이라고 함
		
		if(os.equals("Windows XP"))
		{
			System.out.println("안녕하세요 저는 Windows XP 입니다");
		}else if(os.equals("Windows 7"))
		{
			System.out.println("안녕하세요 저는 Windows 7 입니다");
		}else if(os.equals("Windows 10"))
		{
			System.out.println("안녕하세요 저는 Windows 10 입니다");
			System.out.println("최신버전입니다.");
		}else {
			System.out.println("뭐지?");
		}
		
	}

}
