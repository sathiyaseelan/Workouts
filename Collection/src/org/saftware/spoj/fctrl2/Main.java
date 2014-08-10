package org.saftware.spoj.fctrl2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		while(tc>0){
		long n = Long.parseLong(br.readLine());
		if(n!=0){
		BigInteger fact= new BigInteger("1");
		for(long i=n;i>0;i--){
			fact =fact.multiply(new BigInteger(String.valueOf(i)));
		}System.out.println(fact);
		}
		else{
			System.out.println(1);
		}
		tc--;
	}

	}

}
