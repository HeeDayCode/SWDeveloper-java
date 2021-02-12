package com.kh.homework;

public class Array2Ex104 {
	 public void start() {
         int[][] arr=new int[5][5];
         int k=1;
         for(int i=0; i<5; i++) {
             if(i%2==0) {
            	 for(int j=0;j<5;j++) {
            		 arr[i][j]=k++;
            	 }           	
             }else {
            	 for(int j=4;j>=0;j--) {
            		 arr[i][j]=k++;
            	 }            	 
             }
          }
         for(int i=0; i<5; i++) {
             for(int j=0; j<5; j++) {
                   System.out.printf("%5d", arr[i][j]);
             }
            System.out.println();
        }
        /*1    2    3    4    5
         10    9    8    7    6
         11   12   13   14   15
         20   19   18   17   16
         21   22   23   24   25*/
    }
}
