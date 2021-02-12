package com.kh.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMain {

	public static void main(String[] args) {
		
		HashMap hm =new HashMap();
		
		hm.put(1, new Student(1,"홍길동 ",20,"경기도")); //앞에 키를 get으로 받아오는 대신에 직접써줌 ...
		hm.put(2, new Student(2,"김말똥 ",30,"서울시"));
		hm.put(3, new Student(3,"고길똥 ",50,"부산시"));
		
		System.out.println(hm); //객제 정보가 나옴 //toString을 쓰면 내용 출력이 가능
		
		Set<String> s = hm.keySet();
		
		Iterator<String> iter =s.iterator(); //하나씩 꺼내어 쓴다
		
		while(iter.hasNext())//남아 있어?
		{
			String key = iter.next();
			System.out.println(hm.get(key));		
		}
		
		System.out.println(s);
		
		
		/*Set<Integer> s = hm.keySet();
		
		Iterator<Integer> iter =s.iterator(); //하나씩 꺼내어 쓴다
		
		while(iter.hasNext())//남아 있어?
		{
			Integer key = iter.next();
			System.out.println(hm.get(key));		
		}
		
		System.out.println(s);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*HashMap hm = new HashMap();
		hm.put("one",1);
		hm.put("two",2);
		hm.put("three",3);
	
		//System.out.println(hm.get("four")); //없는 키값을 불러오는 경우 null을 나타낸다
		hm.put("one",1);
		hm.put("one",2);
		hm.put("one",3); //중복을 허용하지 않아서 동일한 내용은 마지막으로 저장 //수정
		
		System.out.println(hm);
		hm.remove("two");
		System.out.println(hm);
		System.out.println(hm.containsKey("two"));
		
		Set<String> s = hm.keySet(); //키값을 다 저장해준다 key값들만을 저장해주겠다
		Iterator<String> iter =s.iterator(); //하나씩 꺼내어 쓴다
		while(iter.hasNext())//남아 있어?
		{
			String key = iter.next();
			System.out.println(hm.get(key));		
		}		*/
	}
}
