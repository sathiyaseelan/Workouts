package org.saftware.hackerrank.loveletter;


import java.util.Scanner;

public class Solution {
   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int _T = in.nextInt();
       while(_T>0){
    	   String _input = in.next();
    	   
    	   int _numberOfOps = 0;
    	   int i=0;
    	   int j=_input.length()-1;
    	   int iter= _input.length()/2;
    	   while(iter>0){
    		  _numberOfOps += Math.abs((int) _input.charAt(j) - (int)_input.charAt(i));
    		  i++;
    		  j--;
    		  iter--;
    	   }
    	   System.out.println(_numberOfOps);
    	   _T--;
       }
       }
       
    	    
}
