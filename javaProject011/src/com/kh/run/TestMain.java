package com.kh.run;

import java.util.HashSet;
import java.util.Iterator;

public class TestMain {

	public static void main(String[] args) {
		HashSet hs =new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		//System.out.println(hs);
		/*ArrayList list =new ArrayList(hs);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);*/
		
		Iterator iter =hs.iterator(); //�ϳ��� �������ֵ���
		
		while(iter.hasNext()) {
		System.out.println(iter.next());
		}
		
		
		
		
		
		
		/*System.out.println(hs.add(10));// boolean ��
		hs.add(20);
		hs.add(30);
		System.out.println(hs); //���� ������� ���� ���� 
		*/
		
	/*	ArrayList list = new ArrayList(); //�ߺ��� ���
		list.add(10);
		list.add(10);
		list.add(10);
		System.out.println(list);*/
		
		

	}

}
