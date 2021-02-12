package com.kh.homework;

import java.util.Scanner;

public class MethodEx3 {
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("100이하의 자연수 입력:");
		int num = sc.nextInt();
		arrayMake(num);
	}
	
	public void arrayMake(int num) {
		int [][] arr = new int [num][num];		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = (i+1)*(j+1);
			}
		}		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.printf("%5d",arr[i][j]);
			}
			System.out.println();
		}
		/*100이하의 자연수 입력:5
		    1    2    3    4    5
		    2    4    6    8   10
		    3    6    9   12   15
		    4    8   12   16   20
		    5   10   15   20   25*/
	}
}
