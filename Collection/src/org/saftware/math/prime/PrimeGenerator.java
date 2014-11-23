package org.saftware.math.prime;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeGenerator {

	/**
	 * This method is to generate primes number upto n (inclusive)
	 * @param n
	 * @return
	 */
	public boolean[] generatePrimes(int n){
		boolean primes[] =  new boolean[n+1];
		Arrays.fill(primes, true);
		primes[0] = false;
		primes[1] = false;
		int m = (int)Math.sqrt(n);
		for(int i=2;i<=m;i++){
			if(primes[i]){
				for(int k=i*i;k<=n;k+=i){
					primes[k]=false;
				}
			}
		}
		return primes;
	}
	
	public Integer[] generatePrimeValues(int n){
		boolean primes[] =  new boolean[n+1];
		Arrays.fill(primes, true);
		primes[0] = false;
		primes[1] = false;
		int m = (int)Math.sqrt(n);
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		for(int i=2;i<=m;i++){
			if(primes[i]){
				primeList.add(i);
				for(int k=i*i;k<=n;k+=i){
					primes[k]=false;
				}
			}
		}
		
		
		return (Integer[])primeList.toArray();
	}
	
	public int[] generatePrimes(int a, int b){
		int[] output;
		int m = (int)Math.sqrt(b);
		Integer[] primes = generatePrimeValues(m);
		boolean isPrimes[] = new boolean[b-a+1];
		Arrays.fill(isPrimes, true);
		for(Integer p : primes){
			for(int i= (a/p);i<=n;i)	
		}
		
		return output;
	}
}

