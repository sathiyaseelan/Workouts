package org.saftware.codechef.chefgift;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		while(tc>0){
			int n = in.nextInt();
			int k = in.nextInt();
			int count=0;
			for(int i=0;i<n;i++){
				if(in.nextInt()%2==0){
					count++;
				}
			}
			
			if(k==0){
				System.out.println("NO");
			}else{
			
			if(count>=k){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			}
			tc--;
		}
	}

}
