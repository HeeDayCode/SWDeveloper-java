package javaEx2;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		String pwd ="1234"; //���ڿ��� ��ü String Ŭ���� pwd���۷��� "1234"��ü cf. int�� �ҹ��ڽ���
							// == ����ü�� �� ������ �׳� ���� ��ü�� �ٸ���(�ּҺ�)
							// ��üŸ�԰� �� ���� ��
		String tmp; // �ƹ��͵� ���� ����
		Scanner sc =new Scanner(System.in);
		System.out.print("�Է�:");
		tmp =sc.next();
		//��ü .�޼ҵ� �����´� 
		if(pwd.equals(tmp)) {
			System.out.println("��й�ȣ�� �����ϴ�.");
		}else {
			System.out.println("��й�ȣ�� �ٸ��ϴ�.");
		}
		
	}

}
