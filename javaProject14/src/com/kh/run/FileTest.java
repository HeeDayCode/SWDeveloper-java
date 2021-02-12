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
		System.out.println("------------메뉴-------------");
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 출력");
		System.out.println("3. Save");
		System.out.println("4. Load");
		System.out.print("선택:");
		int select =sc.nextInt();
		
		switch(select) {
		case 1:insertData(); break;
		case 2:printData(); break;
		case 3:saveData(); break;
		case 4:loadData(); break;
		}
		}
	}
	
	
	//객체정보를 파일에서 읽어오기 위한 메소드
	private void loadData() {
		//필요 스트림  FileInputStream-주스트림 객체가 //넘어갈 수 있는 보조 스트림 -ObjectInputStream
		ObjectInputStream ois =null;
		try {
			ois = new ObjectInputStream(new FileInputStream("student.dat"));
			list =(ArrayList<Student>) ois.readObject();
			System.out.println("불러오기 완료");
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


	//객체정보를 파일로저장
	private void saveData() {
		//필요한 스트림 : FileOutputStream-주스트림 객체가 넘어갈 수 있는 보조 스트림 -ObjectOutputStream
		ObjectOutputStream oos =null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("student.dat"));
			oos.writeObject(list);
			System.out.println("저장 완료");
			
			
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
		System.out.print("이름 입력: ");
		s.setName(sc.next());
		System.out.print("나이 입력: ");
		s.setAge(sc.nextInt());
		System.out.print("주소 입력: ");
		s.setAddr(sc.next());	
		list.add(s);
	}

	//파일에 있는 내용은 16진수 글자로 되어있음 파일 글자 사이사이 띄어쓰기가 존재 
	//파일의 내용은 txt이지만 데이터화하면 gif로 변경해야함
	//문자는 문자이고 바이트는 숫자
	//16진수 47을 표현한 문자 문자로 읽어들이고 숫자로 표현을 변경해야함
	//47이 16진수 이므로 10진수로 변형을 해야함
	public void quiz()
	{
		//읽어들이기 위한 스트림
		BufferedReader bfr =null;	
		//출력을 위한 스크림
		FileOutputStream fos =null;
		
		try {
			//읽어들이기 위한 스트림 만드는 코드
			bfr = new BufferedReader(new FileReader("quiz.txt")); //보조스트림 주스트림
			fos = new FileOutputStream("quiz.gif"); //새롭게 만들기 위한 통로
			String str = bfr.readLine(); //한라인임
			//띄어쓰기는 문자만 있음 
			StringTokenizer st = new StringTokenizer(str, " ");
			
			while(st.hasMoreTokens())
			{
				int data =Integer.parseInt(st.nextToken(),16);//아직 문자 //16진수 입니다 그래서 data에는 16진수값의 10진수가 들어있음
				//지금은 16진수 47인데 10진수로 바꾸어야함
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void charInputStream() //문자로 파일 읽어오기 라인별로 읽기 가능
	{
		System.out.println("파일을 읽어오기 위한 스트림 코드");
		System.out.println("로드할 파일명: ");
		String fileName =sc.next();
		sc.nextLine(); //버퍼비우기
		
		BufferedReader bfr =null;
		try {
			bfr = new BufferedReader(new FileReader(fileName)); //보조 스트림 이용 FileReader(fileName)-주 스트림
			String line ="";
			
			while(true)
			{
				line =bfr.readLine(); //보조 스트림과 관련 기능 Line은 null
				if(line==null)break;
				System.out.println(line); //문자 라인을 줄개행 하세요 while(true)
			
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
	
	
	
	//데이터 넣기
	//읽어온 내용을 다른 곳에 넣어주기 복사
	
	
	//읽어오기 Input -read
	public void byteInputStream() { //파일에 있는 내용을 읽어오기 1byte씩
		FileInputStream fis = null; //한byte씩 읽어오는  스트림 파일명이 필요한데 당장은 없어서 null
		FileOutputStream fos =null;
		
		System.out.print("로딩할 파일명 입력 : ");
		String fileName = sc.next(); //파일명을 입력을 받을 거고 
		sc.nextLine();
		
		System.out.print("새롭게 생성되는 파일명 입력 : ");
		String newFileName = sc.next(); //파일명을 입력을 받을 거고 
		sc.nextLine();
		
		File file = new File(fileName); //File 정보를 볼 수 있는 객체 	
		//현재 폴더 아래에 있으면 상대경로 헤당 프로젝트폴더
		try {									//파일명이 들어갈 수 있음
			fis = new FileInputStream(file); //File 객체를 통해서 만들어준다 여러가지 정보가 필요해서 file 안에 만들어준다 try catch
			//파일통로를 위에서 만들어줌
			fos =new FileOutputStream(newFileName); // 출력하는 스트림
			
			do {
				int data = 0;
				if ((data = fis.read()) == -1) { //fis.read() 1바이트씩 읽겠다 바이트 스트림이니까 try catch -1EOF end of file
					//data = fis.read() 1바이트 읽은 것이 data에 들어감
					System.out.println();
					break;
				} else {
					fos.write(data); //data는 int
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

	
	public void charOutputStream() // 문자스트림
	{
		FileWriter fw = null;
		System.out.print("저장할 파일명: ");
		String fileName = sc.next();
		sc.nextLine();

		try {
			fw = new FileWriter(fileName);
			System.out.println(fileName + "파일에 저장할 내용 입력(종료 exit)");
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
			System.out.println("작성 완료");
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
		System.out.print("파일명을 입력: ");
		String fileName = sc.next();
		sc.nextLine();
		File file = new File(fileName);
		System.out.println("---파일정보보기---");
		if (file.exists()) {
			System.out.println("파일명: " + file.getName());
			System.out.println("해당 디렉토리: " + file.getParent());
			System.out.println("해당 상대경로: " + file.getPath());
			System.out.println("해당 절대경로: " + file.getAbsolutePath());
			System.out.println("파일의 크기: " + file.length() + "Byte");
		} else {
			System.out.println("파일이 없습니다.");
		}
	}

	// 보조스트림을 이용해서 파일 새롭게 만들고 저장
	public void byteOutputSubStream() {
		DataOutputStream dos = null;
		System.out.print("생성할 파일명: ");
		String fileName = sc.next();
		sc.nextLine();

		try {
			dos = new DataOutputStream(new FileOutputStream(fileName)); // 보조스트림은 주스트림을 이용해서 만드는것
			System.out.println("보조스트림 사용");
			System.out.println(fileName + "파일에 저장될 내용입력(종료 exit)");
			int lineNumber = 1;
			do {
				System.out.print((lineNumber++) + ":");
				String str = sc.nextLine(); // 자동으로 \n\r수행
				if (str.equals("exit")) {
					break;
				} else {
					// dos.writeChars(str); //여기부분이 주스트림과 차이가 있음
					dos.writeBytes(str);
				}
			} while (true);
			System.out.println("파일저장완료");
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

	// 바이트 주스트림을 사용 파일 생성 저장
	public void byteOutputStream() {
		FileOutputStream fos = null; // 바이트기반 출력 //바이트는 1바이트씩 읽어오는 것
		System.out.print("생성할 파일명: ");
		String fileName = sc.next();
		sc.nextLine();

		try {
			fos = new FileOutputStream(fileName); // 연결통로 만들기
			System.out.println(fileName + "파일에 저장될 내용입력(종료 exit)");
			int lineNumber = 1;
			do {
				System.out.print((lineNumber++) + ":");
				String str = sc.nextLine() + "\r\n"; /// \n줄개행 \r맨앞으로
				if (str.equals("exit\r\n")) {
					break;
				} else {
					fos.write(str.getBytes()); // 바이트스트림
				}
			} while (true);
			System.out.println("파일저장완료");
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
