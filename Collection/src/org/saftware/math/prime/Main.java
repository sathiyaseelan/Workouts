package org.saftware.math.prime;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/**
		 * Fermerts method
		 * int a = 3;
		double an_mod = Math.pow(a, n) % n;
		double a_mod = a % n;
		System.out.println(an_mod);
		System.out.println(a_mod);
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		System.out.println(isPrime(n));

	}
	private static boolean isPrime(long n){

		boolean isPrime  = true;
		if(n > 7){
		
		if(n%2 ==0 || n%3 ==0 || n%5 ==0){

			isPrime = false;
		}else{

			Double sq_root = Math.sqrt(n);
			String sq_root_str = sq_root.toString();

			if(sq_root_str.substring(sq_root_str.indexOf('.')).equals("0")){

				isPrime = false;

			}else{

				for( int i = 7 ; i <= sq_root ; i+=2){
					
					if(n % i ==0){

						isPrime = false;
						break;
					}
				
				}
			}
		}
		}
		else{
			if(n ==1 || n==2 || n==3 || n==5 || n==7){
				isPrime = true;
			}else{
				isPrime = false;
			}
		}
		return isPrime;
	}


}
