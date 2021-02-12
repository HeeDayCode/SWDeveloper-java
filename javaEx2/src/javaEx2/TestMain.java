package javaEx2;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		String pwd ="1234"; //문자열도 객체 String 클래스 pwd레퍼런스 "1234"객체 cf. int는 소문자시작
							// == 값자체를 비교 정수는 그냥 가능 객체라 다르다(주소비교)
							// 객체타입과 들어가 내용 비교
		String tmp; // 아무것도 없는 상태
		Scanner sc =new Scanner(System.in);
		System.out.print("입력:");
		tmp =sc.next();
		//객체 .메소드 가나온다 
		if(pwd.equals(tmp)) {
			System.out.println("비밀번호가 같습니다.");
		}else {
			System.out.println("비밀번호가 다릅니다.");
		}
		
	}

}
