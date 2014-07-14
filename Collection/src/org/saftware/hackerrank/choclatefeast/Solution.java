package org.saftware.hackerrank.choclatefeast;


import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int n, int c, int m){
           	   	
    	int w = n/c;
    	long numberOfChocs = w; 
    	if(w >= m){
    		
    		while(!(w<m)){
    			
    			w= w-m+1;
    			numberOfChocs++;
    		}
    	}
    	return numberOfChocs;
    }
    
    
}
