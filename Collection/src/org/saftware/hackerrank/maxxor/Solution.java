package org.saftware.hackerrank.maxxor;


import java.util.Scanner;

public class Solution {
/*
 * Complete the function below.
 */

    static int maxXor(int l, int r) {
    	int ret=1;
    	int P = l^r;
    	while(P!=0){
    		ret<<=1;
    		P>>=1;
    	}
    	return ret-1;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}
