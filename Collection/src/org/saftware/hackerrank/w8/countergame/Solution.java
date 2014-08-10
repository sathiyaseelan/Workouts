package org.saftware.hackerrank.w8.countergame;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution{
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t =in.nextInt();
        while(t>0){
             
            BigInteger n = new BigInteger(in.next());
           
        if((n.and(n.subtract(new BigInteger("1")))).intValue()==0){
            System.out.println("Louise");
        }else{
            System.out.println("Richard");
        }
            t--;
    }
    }
}