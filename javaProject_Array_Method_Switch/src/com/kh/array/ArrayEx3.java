package com.kh.array;

import java.util.Scanner;

public class ArrayEx3 {
	public void start() { //Scanner sc =new Scanner(System.in);
		Scanner sc =new Scanner(System.in);
		int[] arr= new int[5];
		int sum=0;

		for(int i=0;i<arr.length;i++) {
			System.out.print((i+1)+"��° �л��� ����:");
			arr[i]=sc.nextInt();
		}		
		System.out.println("<< �Է��� �л����� ���� >>");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			sum=sum+arr[i];  //sum +=arr[i];
		}
		System.out.println();		
		System.out.println("�л����� �� �հ�  : "+sum);
		System.out.println("�л����� �������  : "+((double)sum/arr.length));
		
		//System.out.println("�л����� �� �հ�  :"+" "+(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]));
	}
	
	
}

