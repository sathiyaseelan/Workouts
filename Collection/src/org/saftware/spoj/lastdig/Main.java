package org.saftware.spoj.lastdig;

import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int ref[][]={{0,0,0,0},{1,1,1,1},{2,4,8,6},{3,9,7,1},{4,6,4,6},{5,5,5,5},{6,6,6,6},{7,9,3,1},{8,4,2,6},{9,1,9,1}};
		while(t>0){
			String in[]=br.readLine().split(" ");
			int a=Integer.parseInt(in[0])%10;int o=11;
			if(in[1].equals("0"))o=1;
			if(o==11){
				long b=Long.parseLong(in[1]);
				int i=(int)b%4;if(b==0)i=2;if(i==0)i=4;o=ref[a][i-1];}
			System.out.println(o); 
			t--;
		}}}
