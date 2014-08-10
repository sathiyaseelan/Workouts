package org.saftware.spoj.prime.slieve_of_erothanese;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long start = System.currentTimeMillis();
		int n = Integer.parseInt(br.readLine());
		boolean[] values = new boolean[n+1];
		values[0]=false;
		values[1]=false;
		for(int i=2;i<=n;i++){
			values[i] =true;
		}
		int prime =2;
		
		
		while(prime!=0){
			//Refinement start with p^2 instead 2p 
		for(int i=prime*prime;i<n;i=i+prime){
			values[i]=false;
		}
		prime = findPrime(prime,values);
		}
		for(int i=2;i<n;i++){
			if(values[i]){
				System.out.print(i+" ");
			}
		}System.out.println();
		System.out.println(System.currentTimeMillis()-start);
		
	}
	static int findPrime(int lastprime,boolean[] values){
		int ret=0;
		for(int i=lastprime+1;i<values.length;i++){
			if(values[i]){
				ret =i;
				break;
			}
		}
		return ret;
	}

}
