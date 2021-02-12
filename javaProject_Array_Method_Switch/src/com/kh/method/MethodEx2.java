package com.kh.method;

public class MethodEx2 {

		public void start() {
			int a = 10;
			int b = 3;
			System.out.println(addMethod(a,b)); //13출력
			System.out.println(subMethod(a,b)); //7출력 
			System.out.println(mulMethod(a,b));//30출력
			System.out.println(divMethod(a,b)); //3.333333 출력 
			//System.out.printf("%.2f \n",divMethod(a,b)); 로하면 3.3하고 끝남 
		}
		
		public int addMethod(int num1, int num2)
		{
			int result;
			result = num1+num2;
			return result;
			//return = num1+num2 로 한줄 코딩 가능 
		}
		
		public int subMethod(int num1, int num2)
		{
			int result;
			result = num1-num2;
			return result;
			//return = num1-num2 로 한줄 코딩 가능 
		}
		
		public int mulMethod(int num1, int num2)
		{
			int result;
			result = num1*num2;
			return result;
			//return = num1*num2로 한줄 코딩 가능 
		}
		public double divMethod(int num1, int num2)
		{
			double result;
			result = num1/(double)num2;
			return result;
			//return = num1/(double)num2 로 한줄 코딩 가능 
		}
		
}
