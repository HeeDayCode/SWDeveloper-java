package com.kh.run;

import java.util.StringTokenizer;

public class TestMain {

	public static void main(String[] args) {	
		String str= "ȫ�浿/20/��⵵";
		StringTokenizer st = new StringTokenizer(str,"/");
		
		System.out.println(st.countTokens()); 	//�����ִ� ��ū�� �� 
		System.out.println(st.nextToken());		//����� �ѹ� �غ� ������
		System.out.println(st.hasMoreTokens()); //���� ��ū�� �� �־�?
		
		System.out.println(st.countTokens()); 
		System.out.println(st.nextToken());
		System.out.println(st.hasMoreTokens()); 
		
		System.out.println(st.countTokens()); 
		System.out.println(st.nextToken());
		System.out.println(st.hasMoreTokens()); 
	
	}
}
