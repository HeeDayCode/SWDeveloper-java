package com.kh.run;

public class TestMain {

	public static void main(String[] args) {
		
		AnimalMgr<Tiger> m1= new AnimalMgr<Tiger>(new Tiger("�в�"));
		AnimalMgr<Bear> m2= new AnimalMgr<Bear>(new Bear("�̾߿�"));
		
		System.out.println(m1.getData().getHowl());
		System.out.println(m2.getData().getHowl());

		//System.out.println(m1.getData().getHowl()); ����ȵȴ� Ÿ���� Object�� Tiger�̾ �ٸ��� Objectsms getHowl ����
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
		new GenericTest1<Integer>(1000);  //<��üŸ�Ը� �� �� ����>
		new GenericTest1<Double>(3.14);*/
	
		/*Student s1 = new Student("ȫ�浿", 20, "��⵵ ��õ��");
		Student s2 = new Student("�踻��", 30, "����� ��");
		Student s3 = new Student("��浿", 50, "��õ�� ���");
		Student s4 = new Student("����", 99, "�߱�");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());*/
		/*
		 * ObjectTest1 ot = new ObjectTest1(); //Ŭ������ ��üȭ
		 * System.out.println(ot.toString()); //�⺻������ ���� System.out.println(ot); //�ΰ�����
		 * ���� ���� ���۷����� ����ص� ���� //��Ű���� Ŭ������ ������(@)��ü�ĺ���ȣ ���� ��ü�� ����� �ִ� �� �ĺ���ȣ
		 */
	}
}
