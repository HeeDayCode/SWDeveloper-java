package com.kh.method;

public class MethodEx2 {

		public void start() {
			int a = 10;
			int b = 3;
			System.out.println(addMethod(a,b)); //13���
			System.out.println(subMethod(a,b)); //7��� 
			System.out.println(mulMethod(a,b));//30���
			System.out.println(divMethod(a,b)); //3.333333 ��� 
			//System.out.printf("%.2f \n",divMethod(a,b)); ���ϸ� 3.3�ϰ� ���� 
		}
		
		public int addMethod(int num1, int num2)
		{
			int result;
			result = num1+num2;
			return result;
			//return = num1+num2 �� ���� �ڵ� ���� 
		}
		
		public int subMethod(int num1, int num2)
		{
			int result;
			result = num1-num2;
			return result;
			//return = num1-num2 �� ���� �ڵ� ���� 
		}
		
		public int mulMethod(int num1, int num2)
		{
			int result;
			result = num1*num2;
			return result;
			//return = num1*num2�� ���� �ڵ� ���� 
		}
		public double divMethod(int num1, int num2)
		{
			double result;
			result = num1/(double)num2;
			return result;
			//return = num1/(double)num2 �� ���� �ڵ� ���� 
		}
		
}
