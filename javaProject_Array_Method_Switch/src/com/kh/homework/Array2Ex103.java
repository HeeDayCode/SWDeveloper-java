package com.kh.homework;

public class Array2Ex103 {
	public void start() {
		int[][] arr=new int[5][5];
		int k=1;
		for(int i=0; i<5; i++) {
			for(int j=4; j>=0; j--) {
				arr[j][i]=k++;
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
               System.out.printf("%5d", arr[i][j]);
			 }
            System.out.println();
        }
	   	 /* 5   10   15   20   25
		    4    9   14   19   24
		    3    8   13   18   23
		    2    7   12   17   22
		    1    6   11   16   21*/

	}
}
