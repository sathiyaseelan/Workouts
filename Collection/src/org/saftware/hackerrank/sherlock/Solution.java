package org.saftware.hackerrank.sherlock;


import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T =  in.nextInt();
        while(T>0){
        	long N = in.nextLong();
        	long rem3 = N%3;
        	
        	if(rem3==0){
        		for(int i=0;i<N/3;i++){System.out.print("555");}
        		
        	}
        	else if(rem3==1 && N-10 >=3){
        		for(int i=0;i<(N-10)/3;i++){System.out.print("555");}
        		System.out.print("3333333333");
        	}
        	else if(rem3==2 && N-5 >=3){
        		for(int i=0;i<(N-5)/3;i++){System.out.print("555");}
        		System.out.print("33333");
        	}
        	else{
        		if(N%5==0){
        			for(int i=0;i<N/5;i++){System.out.print("33333");}
        			
        		}else{
        			System.out.print("-1");
        		}
        	}
        	System.out.println();
        	T--;
        }
    }
}
