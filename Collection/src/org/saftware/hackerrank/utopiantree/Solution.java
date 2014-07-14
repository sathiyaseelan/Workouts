package org.saftware.hackerrank.utopiantree;


import java.util.Scanner;


public class Solution {
   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int _T = in.nextInt();
        
        
        while(_T!=0){
        	int _N = in.nextInt();
        	int height=1;
        	for(int i=1 ; i<= _N ;i++){
        		if(i%2 == 0){
        			height+=1;
        		}else{
        			height *=2;
        		}
        	}
        	System.out.println(height);
        	_T--;
        }
   }
 
 
}
