package org.saftware.hackerearth.roy_rangoli;

import java.util.Scanner;

class TestClass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
			if(isPrime(i+j)){
				
				count++;
			}
			}
		}
		System.out.println(count);
		
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
			if(n==2 || n==3 || n==5 || n==7){
				isPrime = true;
			}else{
				isPrime = false;
			}
		}
		return isPrime;
	}


}
