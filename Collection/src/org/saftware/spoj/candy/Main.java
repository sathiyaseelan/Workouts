package org.saftware.spoj.candy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		while((n=Integer.parseInt(br.readLine()))!=-1){
			int[] packets =  new int[n];
			int total = 0;
			for(int i=0;i<n;i++){
				int packet =  Integer.parseInt(br.readLine());
				packets[i] = packet;
				total += packet;
			}
			if(total%n==0){
				int average = total/n;
				int numberOfMoves=0;
				for(int i=n-1;i>=0;i--){
					if(packets[i]<average){
						numberOfMoves+= (average-packets[i]);
					}
				
				}
				System.out.println(numberOfMoves);
			}else{
				System.out.println("-1");
			}
		}
	}

}
