package org.saftware.spoj.divsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int T = in.read();
			while(T>0){
			long n = Long.parseLong(in.readLine());
			long sum = 1; 
			long sq_rt = (long) Math.sqrt(n);
			if(n%2 ==0){
				for (int i= 2 ;i <= sq_rt ;i+=2){
					sum += (n/i)+i;
				}	
			}else{
				for (int i= 3 ;i <= sq_rt ;i+=2){
					if(n%i ==0){
					sum += (n/i)+i;
					}
				}
			}
			System.out.println(sum);
			T--;
		 
		}

	}

}
