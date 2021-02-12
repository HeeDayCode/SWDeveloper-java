package com.kh.homework;

public class Array2Ex203 {
	 public void start() {
         int[][] arr=new int[5][5];
         int k=1;
         for(int i=0; i<5; i++) {
             if(i%2==0) {
            	 for(int j=4;j>=0;j--) {
            		 arr[j][i]=k++;
            	 }            	
             }else {
            	 for(int j=0;j<5;j++) {
            		 arr[j][i]=k++;
            	 }            	 
             }
          }
         for(int i=0; i<5; i++) {
             for(int j=0; j<5; j++) {
                   System.out.printf("%5d", arr[i][j]);
             }
            System.out.println();
         }
       /*5    6   15   16   25
         4    7   14   17   24
         3    8   13   18   23
         2    9   12   19   22
         1   10   11   20   21*/
    }
}
