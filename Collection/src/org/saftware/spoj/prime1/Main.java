package org.saftware.spoj.prime1;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int T = in.nextInt();
	while(T>0){
		long a = in.nextLong();
		long b = in.nextLong();
		if(a==1){
			
			System.out.println(1+"\n"+2);
		}else if(a==2){
			System.out.println(2);
		}
		a = (a %2==0)?a+1:a; 
		for(long i=3; i<=b;i+=2 ){
			if(isPrime(i)){
				System.out.println(i);
			}
		}
		System.out.println();
		T--;
	}

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
