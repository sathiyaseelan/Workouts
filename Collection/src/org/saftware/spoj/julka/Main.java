package org.saftware.spoj.julka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc =10;
		while(tc>0){
			BigInteger total = new BigInteger(br.readLine());
			BigInteger z = new BigInteger(br.readLine());
			BigInteger y = total.subtract(z).divide(new BigInteger("2"));
			BigInteger x = total.subtract(y);
			System.out.println(x.toString());
			System.out.println(y.toString());
			tc--;
		}
	}

}
