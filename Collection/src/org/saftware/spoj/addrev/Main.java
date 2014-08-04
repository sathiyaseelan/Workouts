package org.saftware.spoj.addrev;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		while(tc>0){
		StringTokenizer str = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(reverse(str.nextToken()));
		int b = Integer.parseInt(reverse(str.nextToken()));
		System.out.println(reverse(String.valueOf(a+b)));
		tc--;
		}
	}
	static String reverse(String input){
		String output="";
		
		for(int i=input.length()-1;i>=0;i--){
		output=output+input.charAt(i);	
		}
		output = output.replaceFirst("^[0]*", "");
		return output;
	}
}
