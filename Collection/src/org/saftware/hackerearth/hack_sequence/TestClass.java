package org.saftware.hackerearth.hack_sequence;

import java.util.Scanner;
/*
 *  Hi = 2014*Hi-1 + 69*Hi-2 for (i>2)
 * @author root
 *
 */
class TestClass {
	static long _m = (long) (Math.pow(10,9)+7);
    public static void main(String args[] ) throws Exception {
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	while(t>0){
		long n = in.nextLong();
		long h = 2014*n
		System.out.println(in.nextLong()%_m);
		t--;
	}
        
    }
}
