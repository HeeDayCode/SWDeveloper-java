package com.kh.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileTest2 {
	private Scanner sc = new Scanner(System.in);

	// 바이트 주스트림을 사용 파일 생성 저장
	public void byteOutputStream() {
		System.out.print("생성할 파일명: ");
		String fileName = sc.next();
		sc.nextLine();

		try(FileOutputStream fos = new FileOutputStream(fileName)) {
			 //연결통로 만들기
			System.out.println(fileName + "파일에 저장될 내용입력(종료 exit)");
			int lineNumber = 1;
			do {
				System.out.print((lineNumber++) + ":");
				String str = sc.nextLine() + "\r\n"; /// \n줄개행 \r맨앞으로
				if (str.equals("exit\r\n")) {
					break;
				} else {
					fos.write(str.getBytes()); //바이트스트림
				}
			} while (true);
			System.out.println("파일저장완료");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
