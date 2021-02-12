package com.kh.homework;

public class Array2Ex102 {
	public void start() {       
        int[][] arr=new int[5][5];
        int k=1;
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                arr[j][i]=k++;                
            }
        }
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                System.out.printf("%5d",arr[i][j]);                  
            }
            System.out.println();
        }
	      /*1    6   11   16   21
	        2    7   12   17   22
	        3    8   13   18   23
	        4    9   14   19   24
	        5   10   15   20   25*/

	}
}
