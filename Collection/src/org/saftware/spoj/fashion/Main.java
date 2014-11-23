package org.saftware.spoj.fashion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		while(tc>0){
			int n = Integer.parseInt(br.readLine());
			StringTokenizer maleStr = new StringTokenizer(br.readLine());
			StringTokenizer femaleStr = new StringTokenizer(br.readLine());
			int[] male = new int[n];
			int[] female = new int[n];
			
			for(int i=0;i<n;i++){
				male[i] = Integer.parseInt(maleStr.nextToken());
				female[i] = Integer.parseInt(femaleStr.nextToken());
			}
			Arrays.sort(male);
			Arrays.sort(female);
			int output = 0;
			for(int i=n-1;i>=0;i--){
				output+= (male[i]*female[i]);
			}
			System.out.println(output);
			tc--;
		}
		
	}

}
