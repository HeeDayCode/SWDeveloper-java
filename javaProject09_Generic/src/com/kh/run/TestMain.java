package com.kh.run;

public class TestMain {

	public static void main(String[] args) {
		
		AnimalMgr<Tiger> m1= new AnimalMgr<Tiger>(new Tiger("꽥꽥"));
		AnimalMgr<Bear> m2= new AnimalMgr<Bear>(new Bear("미야우"));
		
		System.out.println(m1.getData().getHowl());
		System.out.println(m2.getData().getHowl());

		//System.out.println(m1.getData().getHowl()); 실행안된다 타입이 Object와 Tiger이어서 다르고 Objectsms getHowl 없음
		/*System.out.println(((Tiger)m1.getData()).getHowl());
		System.out.println(((Bear)m2.getData()).getHowl());
		*/
	
		/*GenericTest2 gt1 = new GenericTest2<String, Integer>("hello", 100);
		GenericTest2 gt2 = new GenericTest2<Double, Character>(3.14, 'A');
		System.out.println(gt1.geData1());
		System.out.println(gt1.geData2());
		System.out.println(gt2.geData1());
		System.out.println(gt2.geData2());
		*/
		
		/*new GenericTest1<String>("Hello");
		new GenericTest1<Integer>(1000);  //<객체타입만 들어갈 수 있음>
		new GenericTest1<Double>(3.14);*/
	
		/*Student s1 = new Student("홍길동", 20, "경기도 부천시");
		Student s2 = new Student("김말똥", 30, "서울시 목동");
		Student s3 = new Student("고길동", 50, "인천시 계양");
		Student s4 = new Student("유비", 99, "중국");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());*/
		/*
		 * ObjectTest1 ot = new ObjectTest1(); //클래스를 객체화
		 * System.out.println(ot.toString()); //기본정보를 리턴 System.out.println(ot); //두가지는
		 * 같은 내용 레퍼런스를 출력해도 같음 //패키지명 클래스명 구분자(@)객체식별번호 여러 객체를 만들수 있는 데 식별번호
		 */
	}
}
