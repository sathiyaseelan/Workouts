package org.saftware.spoj.fctrl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		while(tc>0){
		long n = Long.parseLong(br.readLine());
		int i=1;
		long count=0;
		while(true){
			long denom = (long) Math.pow(5, i);
			
			if(denom <= n){
				count+= Math.floor((n/denom));
			}else{
				break;
			}
			i++;
		}
		System.out.println(count);
		tc--;
	}
	}
}
