package org.saftware.math.prime;

public class PrimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			PrimeGenerator primeGenerator = new PrimeGenerator();
			int n=7;
			boolean primes[] = primeGenerator.generatePrimes(n);
			for(int i=0;i<=n;i++){
				if(primes[i]){
					System.out.println(i);
				}
			}
	}

}
