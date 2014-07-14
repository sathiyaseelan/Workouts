package org.saftware.hackerrank.candyjars;


import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N =  in.nextLong();
        long averageCandy = 0;
        long M = in.nextInt();
        long totalCandy=0;
        for(long i=0;i<M;i++){
        	long a = in.nextLong();
        	long b = in.nextLong();
        	long k = in.nextLong();
        	totalCandy+= ((b-a)+1)*k;
        }
        averageCandy = totalCandy/N;
        System.out.println(averageCandy);
    }
    
}
