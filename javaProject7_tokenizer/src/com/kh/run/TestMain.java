package com.kh.run;

import java.util.StringTokenizer;

public class TestMain {

	public static void main(String[] args) {	
		String str= "홍길동/20/경기도";
		StringTokenizer st = new StringTokenizer(str,"/");
		
		System.out.println(st.countTokens()); 	//남아있는 토큰의 수 
		System.out.println(st.nextToken());		//출력을 한번 해볼 수있음
		System.out.println(st.hasMoreTokens()); //남은 토큰이 또 있어?
		
		System.out.println(st.countTokens()); 
		System.out.println(st.nextToken());
		System.out.println(st.hasMoreTokens()); 
		
		System.out.println(st.countTokens()); 
		System.out.println(st.nextToken());
		System.out.println(st.hasMoreTokens()); 
	
	}
}
