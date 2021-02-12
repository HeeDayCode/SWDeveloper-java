package com.kh.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileTest2 {
	private Scanner sc = new Scanner(System.in);

	// ����Ʈ �ֽ�Ʈ���� ��� ���� ���� ����
	public void byteOutputStream() {
		System.out.print("������ ���ϸ�: ");
		String fileName = sc.next();
		sc.nextLine();

		try(FileOutputStream fos = new FileOutputStream(fileName)) {
			 //������� �����
			System.out.println(fileName + "���Ͽ� ����� �����Է�(���� exit)");
			int lineNumber = 1;
			do {
				System.out.print((lineNumber++) + ":");
				String str = sc.nextLine() + "\r\n"; /// \n�ٰ��� \r�Ǿ�����
				if (str.equals("exit\r\n")) {
					break;
				} else {
					fos.write(str.getBytes()); //����Ʈ��Ʈ��
				}
			} while (true);
			System.out.println("��������Ϸ�");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
