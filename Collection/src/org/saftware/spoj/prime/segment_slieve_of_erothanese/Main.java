package org.saftware.spoj.prime.segment_slieve_of_erothanese;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		//long start = System.currentTimeMillis();
		while(tc >0){
		StringTokenizer str = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(str.nextToken());
		int b = Integer.parseInt(str.nextToken());
		
		int n = (int)Math.sqrt(b);
		int[] primes = findPrimesList(n);
		boolean primesSet[] = new boolean[100001];
		for(int i=0;i<=100001;i++){
			primesSet[i]=true;
		}
		//Segmentation begins
		for(int i=0;i<primes.length;i++){
			int p =primes[i];
			int offset = (int)(p*Math.floor(a/p));
			for(int j=offset;j<=b;j=j+p){
				if(j<a){
					continue;
				}else{
					primesSet[j-a]=false;
				}
			}
			 
		}
		for(int i=0;i<primes.length;i++){
			if(primes[i] >=a && primes[i]<=b){
				System.out.println(primes[i]);
			}
		}
		for(int i=0;i<b-a+1;i++){
			if(primesSet[i] && i+a!=1){
				System.out.println(i+a);
			}
		}
		//System.out.println();
		//System.out.println(System.currentTimeMillis()-start);
		tc--;
		}
	}
	static int[] findPrimesList(int n){
		n=n+1;
		boolean[] values = new boolean[n+1];
		values[0]=false;
		values[1]=false;
		for(int i=2;i<=n;i++){
			values[i] =true;
		}
		int prime =2;
		
		int numPrimes=0;
		while(prime!=0){
			numPrimes++;
			//Refinement start with p^2 instead 2p 
		for(int i=prime*prime;i<n;i=i+prime){
			values[i]=false;
		}
		prime = findNextPrime(prime,values);
		
		}
		int[] primes = new int[numPrimes-1];
		int top=0;
		for(int i=2;i<n;i++){
			if(values[i]){
				primes[top++]=i;
			
			}
		}
		return primes;
	}
	static int findNextPrime(int lastprime,boolean[] values){
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
