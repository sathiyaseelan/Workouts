package org.saftware.hackerearth.stringmade;


import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
        
*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count=0;
        int[] ref = {6,2,5,5,4,5,6,3,7,6};
        int i;
        while(true){
        	 i = br.read();
        	 if(i=='\n'){
        		 break;
        	 }else{
        	 count+=ref[i-48];
        	 }
        }
        
        System.out.println(count);
    }
}
