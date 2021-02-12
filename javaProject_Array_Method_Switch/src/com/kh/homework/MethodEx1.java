package com.kh.homework;

public class MethodEx1 {
	public void start() {
		int a = 10;
		int b = 3;
		System.out.println(addMethod(a,b)); 
		System.out.println(subMethod(a,b));
		System.out.println(mulMethod(a,b));
		System.out.printf("%.9f \n",divMethod(a,b)); 		
	}
	
	public int addMethod(int num1, int num2)
	{
		return num1+num2;		
	}	
	public int subMethod(int num1, int num2)
	{
		return num1-num2;
	}	
	public int mulMethod(int num1, int num2)
	{
		return num1*num2;
	}
	public double divMethod(int num1, int num2)
	{
		return num1/(double)num2;
	}
	 /*13
		7
		30
		3.333333333 */
	
}
