package org.saftware.hackerearth.roy_led;

import java.util.Scanner;

class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] count = new int[8];
		
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		
		int _r =1;
		int _g =1;
		int _b =1;
		
		boolean isRedOn =false;
		boolean isGreenOn =false;
		boolean isBlueOn =false;
		
		while(t>0){
					
			
			if(isRedOn && !isGreenOn && !isBlueOn){
				count[0]++;
			}else if(!isRedOn && isGreenOn && !isBlueOn){
				count[1]++;
			}else if(!isRedOn && !isGreenOn && isBlueOn){
				count[2]++;
			}else if(isRedOn && isGreenOn && !isBlueOn){
				count[3]++;
			}else if(!isRedOn && isGreenOn && isBlueOn){
				count[4]++;
			}else if(isRedOn && !isGreenOn && isBlueOn){
				count[5]++;
			}else if(isRedOn && isGreenOn && isBlueOn){
				count[6]++;
			}else{
				count[7]++;
			}
			if(_r==r){
				_r=1;
				isRedOn = !isRedOn;
			}else{
				_r++;
			}
	
			if(_g==g){
				_g=1;
				isGreenOn = !isGreenOn;
			}else{
				_g++;
			}
	
			if(_b==b){
				_b=1;
				isBlueOn = !isBlueOn;
			}else{
				_b++;
			}
	
	
		t--;	
		}
		for(int i=0;i<8;i++){
			System.out.print(count[i]+" ");
		}

	}

}
