package com.kh.method;

import java.util.Scanner;

public class MethodEx3 {

		public void start()
		{
			//소문자의 범위:97~122
			//대문자의 범위:65~90 
			//소문자 a:97 / 대문자 A: 65  / 32차이가 난다!
			//소문자 b:98 / 대문자 B: 90  / 32차이가 난다!
			//소문자 z:122/ 대문자 Z: 90  / 32 차이가 난다!
			
			Scanner sc = new Scanner(System.in);
			char ch;
			System.out.print("문자 한글자(소문자) 입력 : ");
			ch = sc.next().charAt(0);
			
			System.out.println("입력한 문자 : "+ ch);			
			System.out.printf("입력한 문자 변환 : %c \n",(ch-32));
		}
}
