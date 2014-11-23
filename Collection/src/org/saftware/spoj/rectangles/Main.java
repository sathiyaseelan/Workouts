package org.saftware.spoj.rectangles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			int midpoint = N/2;
			int output = N-midpoint;
			for(int i=1;i<=midpoint;i++){
				int j=1;
				while(j<=i && i*j<=N){
					output++;
					j++;
				}
			}
			System.out.println(output);
			
		
	}

}
