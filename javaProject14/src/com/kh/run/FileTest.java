package com.kh.run;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileTest {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Student> list =new ArrayList<Student>();
	public FileTest()
	{
		loadData();
	}
	
	
	public void objectIO()
	{
		while(true) {
		System.out.println("------------�޴�-------------");
		System.out.println("1. �л����� �Է�");
		System.out.println("2. �л����� ���");
		System.out.println("3. Save");
		System.out.println("4. Load");
		System.out.print("����:");
		int select =sc.nextInt();
		
		switch(select) {
		case 1:insertData(); break;
		case 2:printData(); break;
		case 3:saveData(); break;
		case 4:loadData(); break;
		}
		}
	}
	
	
	//��ü������ ���Ͽ��� �о���� ���� �޼ҵ�
	private void loadData() {
		//�ʿ� ��Ʈ��  FileInputStream-�ֽ�Ʈ�� ��ü�� //�Ѿ �� �ִ� ���� ��Ʈ�� -ObjectInputStream
		ObjectInputStream ois =null;
		try {
			ois = new ObjectInputStream(new FileInputStream("student.dat"));
			list =(ArrayList<Student>) ois.readObject();
			System.out.println("�ҷ����� �Ϸ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	//��ü������ ���Ϸ�����
	private void saveData() {
		//�ʿ��� ��Ʈ�� : FileOutputStream-�ֽ�Ʈ�� ��ü�� �Ѿ �� �ִ� ���� ��Ʈ�� -ObjectOutputStream
		ObjectOutputStream oos =null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("student.dat"));
			oos.writeObject(list);
			System.out.println("���� �Ϸ�");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void printData() {
		for(Student s : list)
		{
			System.out.println(s);
		}	
	}

	private void insertData() {
		Student s = new Student();
		System.out.print("�̸� �Է�: ");
		s.setName(sc.next());
		System.out.print("���� �Է�: ");
		s.setAge(sc.nextInt());
		System.out.print("�ּ� �Է�: ");
		s.setAddr(sc.next());	
		list.add(s);
	}

	//���Ͽ� �ִ� ������ 16���� ���ڷ� �Ǿ����� ���� ���� ���̻��� ���Ⱑ ���� 
	//������ ������ txt������ ������ȭ�ϸ� gif�� �����ؾ���
	//���ڴ� �����̰� ����Ʈ�� ����
	//16���� 47�� ǥ���� ���� ���ڷ� �о���̰� ���ڷ� ǥ���� �����ؾ���
	//47�� 16���� �̹Ƿ� 10������ ������ �ؾ���
	public void quiz()
	{
		//�о���̱� ���� ��Ʈ��
		BufferedReader bfr =null;	
		//����� ���� ��ũ��
		FileOutputStream fos =null;
		
		try {
			//�о���̱� ���� ��Ʈ�� ����� �ڵ�
			bfr = new BufferedReader(new FileReader("quiz.txt")); //������Ʈ�� �ֽ�Ʈ��
			fos = new FileOutputStream("quiz.gif"); //���Ӱ� ����� ���� ���
			String str = bfr.readLine(); //�Ѷ�����
			//����� ���ڸ� ���� 
			StringTokenizer st = new StringTokenizer(str, " ");
			
			while(st.hasMoreTokens())
			{
				int data =Integer.parseInt(st.nextToken(),16);//���� ���� //16���� �Դϴ� �׷��� data���� 16�������� 10������ �������
				//������ 16���� 47�ε� 10������ �ٲپ����
				fos.write(data);
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bfr.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void charInputStream() //���ڷ� ���� �о���� ���κ��� �б� ����
	{
		System.out.println("������ �о���� ���� ��Ʈ�� �ڵ�");
		System.out.println("�ε��� ���ϸ�: ");
		String fileName =sc.next();
		sc.nextLine(); //���ۺ���
		
		BufferedReader bfr =null;
		try {
			bfr = new BufferedReader(new FileReader(fileName)); //���� ��Ʈ�� �̿� FileReader(fileName)-�� ��Ʈ��
			String line ="";
			
			while(true)
			{
				line =bfr.readLine(); //���� ��Ʈ���� ���� ��� Line�� null
				if(line==null)break;
				System.out.println(line); //���� ������ �ٰ��� �ϼ��� while(true)
			
			}	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bfr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	//������ �ֱ�
	//�о�� ������ �ٸ� ���� �־��ֱ� ����
	
	
	//�о���� Input -read
	public void byteInputStream() { //���Ͽ� �ִ� ������ �о���� 1byte��
		FileInputStream fis = null; //��byte�� �о����  ��Ʈ�� ���ϸ��� �ʿ��ѵ� ������ ��� null
		FileOutputStream fos =null;
		
		System.out.print("�ε��� ���ϸ� �Է� : ");
		String fileName = sc.next(); //���ϸ��� �Է��� ���� �Ű� 
		sc.nextLine();
		
		System.out.print("���Ӱ� �����Ǵ� ���ϸ� �Է� : ");
		String newFileName = sc.next(); //���ϸ��� �Է��� ���� �Ű� 
		sc.nextLine();
		
		File file = new File(fileName); //File ������ �� �� �ִ� ��ü 	
		//���� ���� �Ʒ��� ������ ����� ��� ������Ʈ����
		try {									//���ϸ��� �� �� ����
			fis = new FileInputStream(file); //File ��ü�� ���ؼ� ������ش� �������� ������ �ʿ��ؼ� file �ȿ� ������ش� try catch
			//������θ� ������ �������
			fos =new FileOutputStream(newFileName); // ����ϴ� ��Ʈ��
			
			do {
				int data = 0;
				if ((data = fis.read()) == -1) { //fis.read() 1����Ʈ�� �аڴ� ����Ʈ ��Ʈ���̴ϱ� try catch -1EOF end of file
					//data = fis.read() 1����Ʈ ���� ���� data�� ��
					System.out.println();
					break;
				} else {
					fos.write(data); //data�� int
					//System.out.println(data);
				}
			} while (true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	public void charOutputStream() // ���ڽ�Ʈ��
	{
		FileWriter fw = null;
		System.out.print("������ ���ϸ�: ");
		String fileName = sc.next();
		sc.nextLine();

		try {
			fw = new FileWriter(fileName);
			System.out.println(fileName + "���Ͽ� ������ ���� �Է�(���� exit)");
			int lineNumber = 1;
			do {
				System.out.print((lineNumber++) + ":");
				String str = sc.nextLine();
				if (str.equals("exit")) {
					break;
				} else {
					fw.write(str + "\r\n");
				}

			} while (true);
			System.out.println("�ۼ� �Ϸ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void fileSearch() {
		System.out.print("���ϸ��� �Է�: ");
		String fileName = sc.next();
		sc.nextLine();
		File file = new File(fileName);
		System.out.println("---������������---");
		if (file.exists()) {
			System.out.println("���ϸ�: " + file.getName());
			System.out.println("�ش� ���丮: " + file.getParent());
			System.out.println("�ش� �����: " + file.getPath());
			System.out.println("�ش� ������: " + file.getAbsolutePath());
			System.out.println("������ ũ��: " + file.length() + "Byte");
		} else {
			System.out.println("������ �����ϴ�.");
		}
	}

	// ������Ʈ���� �̿��ؼ� ���� ���Ӱ� ����� ����
	public void byteOutputSubStream() {
		DataOutputStream dos = null;
		System.out.print("������ ���ϸ�: ");
		String fileName = sc.next();
		sc.nextLine();

		try {
			dos = new DataOutputStream(new FileOutputStream(fileName)); // ������Ʈ���� �ֽ�Ʈ���� �̿��ؼ� ����°�
			System.out.println("������Ʈ�� ���");
			System.out.println(fileName + "���Ͽ� ����� �����Է�(���� exit)");
			int lineNumber = 1;
			do {
				System.out.print((lineNumber++) + ":");
				String str = sc.nextLine(); // �ڵ����� \n\r����
				if (str.equals("exit")) {
					break;
				} else {
					// dos.writeChars(str); //����κ��� �ֽ�Ʈ���� ���̰� ����
					dos.writeBytes(str);
				}
			} while (true);
			System.out.println("��������Ϸ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// ����Ʈ �ֽ�Ʈ���� ��� ���� ���� ����
	public void byteOutputStream() {
		FileOutputStream fos = null; // ����Ʈ��� ��� //����Ʈ�� 1����Ʈ�� �о���� ��
		System.out.print("������ ���ϸ�: ");
		String fileName = sc.next();
		sc.nextLine();

		try {
			fos = new FileOutputStream(fileName); // ������� �����
			System.out.println(fileName + "���Ͽ� ����� �����Է�(���� exit)");
			int lineNumber = 1;
			do {
				System.out.print((lineNumber++) + ":");
				String str = sc.nextLine() + "\r\n"; /// \n�ٰ��� \r�Ǿ�����
				if (str.equals("exit\r\n")) {
					break;
				} else {
					fos.write(str.getBytes()); // ����Ʈ��Ʈ��
				}
			} while (true);
			System.out.println("��������Ϸ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
