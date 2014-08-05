package org.saftware.spoj.arith;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		while(tc>0){
			String input = br.readLine();
			
			String[] numbers = input.split("[+-/*]");
			char[] num1 = numbers[0].toCharArray();
			char[] num2 = numbers[1].toCharArray();
			char operator=input.charAt(num1.length);
			if(num1.length<=num2.length){
				int numSpaces= num2.length-num1.length+1;
				for(int i=numSpaces;i>0;i--){
					System.out.print(" ");
					}
					System.out.println(num1);
					
					System.out.print(operator);
					System.out.println(num2);
					for(int i=numSpaces+num1.length;i>0;i--){
						System.out.print("-");
					}
					System.out.println();
					if(operator=='+'){
						for(int i=num2.length;i>0 ;i--){
							
						}
						}
						if(operator=='-'){
							
						}

			}else{
				int numSpaces= num1.length-num2.length-1;
				
					System.out.println(num1);
					
					for(int i=numSpaces;i>0;i--){
						System.out.print(" ");
						}
					System.out.print(operator);
					System.out.println(num2);
					for(int i=num1.length;i>0;i--){
						System.out.print("-");
					}
					System.out.println();
			}
			
			
//			int numSpaces= Math.abs(num1.length-num2.length)+1;
			
			/*System.out.println(num1);
			System.out.println(num2);
			for(int num : num1){
				System.out.print(num+"=");
				System.out.println(num-48);
			}*/
			
			tc--;	
		}


	}

}
