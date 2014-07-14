package org.saftware.hackerrank.halloween;


import java.util.Scanner;


public class Solution {
   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int T = in.nextInt();
       while(T>0){
    	   long K = in.nextInt();
    	   long i=1;
    	   long j=1;
    	   if(K%2==0){
    		   i = j = K/2;
    	   }else
    	   {
    		   i = (K/2)+1;
    		   j= (K/2);
    	   }
    	   System.out.println(i*j);
    	   T--;
       }
       
       
   }
 
 
}
