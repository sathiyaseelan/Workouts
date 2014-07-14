package org.saftware.hackerrank.manasa;


import java.util.Scanner;
import java.util.TreeSet;


public class Solution {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T>0){
        	long n =  in.nextInt();
        	long a =  in.nextInt();
        	long b =  in.nextInt();
        	long i=n-1;
        	long j=0;
        	TreeSet<Long> stones = new TreeSet<Long>();
        	while(i>=0 && j<=n-1){
        		long value = (i*a)+(j*b);
        		stones.add(value);
        		i--;
        		j++;
        	}
        	
        	for(Long stone : stones){
        		System.out.print(stone+" ");
        	}
        	System.out.println();
        	T--;
        }
    }
}
