package org.saftware.hackerearth.lendkart.rick;

import java.util.Arrays;
import java.util.Scanner;

class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		while(tc>0){
			int n = in.nextInt();
			int[] values = new int[n];
			for(int i=0;i<n;i++){
				values[i] =in.nextInt();
			}
			Arrays.sort(values);
			int count =0;
			boolean survive =true;
			int i=0;
			while(i<n)
			{

				if((values[i]-i)!=0){
//				values[i]=0;
				count++;
				}
				else{
					survive = false;
					break;
				}
				if(i>0 && i%5==0){
					i=i+2;
				}else{
					i++;
				}
			}
			if(survive){
				System.out.println("Rick now go and save Carl and Judas");	
			}else{
				System.out.println("Goodbye Rick");
				System.out.println(count);
			}
			
			tc--;
		}

	}

}
