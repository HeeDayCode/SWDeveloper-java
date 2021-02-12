package com.kh.homework;

public class Array2Ex201 {
	 public void start() {
         int[][] arr=new int[5][5];
         int k=1;
         for(int i=0; i<5; i++) {
             if(i%2==0) {
            	 for(int j=4;j>=0;j--) {
            		 arr[i][j]=k++;
            	 }           	
             }else {
            	 for(int j=0;j<5;j++) {
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
	       /*5    4    3    2    1
	         6    7    8    9   10
	        15   14   13   12   11
	        16   17   18   19   20
	        25   24   23   22   21*/
    }
}
