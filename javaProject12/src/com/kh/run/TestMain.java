package com.kh.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMain {

	public static void main(String[] args) {
		
		HashMap hm =new HashMap();
		
		hm.put(1, new Student(1,"ȫ�浿 ",20,"��⵵")); //�տ� Ű�� get���� �޾ƿ��� ��ſ� �������� ...
		hm.put(2, new Student(2,"�踻�� ",30,"�����"));
		hm.put(3, new Student(3,"���� ",50,"�λ��"));
		
		System.out.println(hm); //���� ������ ���� //toString�� ���� ���� ����� ����
		
		Set<String> s = hm.keySet();
		
		Iterator<String> iter =s.iterator(); //�ϳ��� ������ ����
		
		while(iter.hasNext())//���� �־�?
		{
			String key = iter.next();
			System.out.println(hm.get(key));		
		}
		
		System.out.println(s);
		
		
		/*Set<Integer> s = hm.keySet();
		
		Iterator<Integer> iter =s.iterator(); //�ϳ��� ������ ����
		
		while(iter.hasNext())//���� �־�?
		{
			Integer key = iter.next();
			System.out.println(hm.get(key));		
		}
		
		System.out.println(s);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*HashMap hm = new HashMap();
		hm.put("one",1);
		hm.put("two",2);
		hm.put("three",3);
	
		//System.out.println(hm.get("four")); //���� Ű���� �ҷ����� ��� null�� ��Ÿ����
		hm.put("one",1);
		hm.put("one",2);
		hm.put("one",3); //�ߺ��� ������� �ʾƼ� ������ ������ ���������� ���� //����
		
		System.out.println(hm);
		hm.remove("two");
		System.out.println(hm);
		System.out.println(hm.containsKey("two"));
		
		Set<String> s = hm.keySet(); //Ű���� �� �������ش� key���鸸�� �������ְڴ�
		Iterator<String> iter =s.iterator(); //�ϳ��� ������ ����
		while(iter.hasNext())//���� �־�?
		{
			String key = iter.next();
			System.out.println(hm.get(key));		
		}		*/
	}
}
