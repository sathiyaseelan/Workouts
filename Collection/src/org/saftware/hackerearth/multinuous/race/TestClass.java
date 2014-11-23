package org.saftware.hackerearth.multinuous.race;

import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        while(tc>0){
        	int n = scanner.nextInt();
        	int[] heights = new int[n];
//        	StringTokenizer str = new StringTokenizer(br.readLine());
        	for(int i=0;i<n;i++){
        		
        		heights[i] = scanner.nextInt();
        	}
        	int[] sights = new int[n];
        	int winner=0;
        	for(int i=0,max=0;i<n;i++){
        		sights[i] = ((findForward(i, heights) +findBackward(i, heights))*i)%1000000007;
        		if(sights[i]>max){
        			max=sights[i];
        			winner=i;
        		}
        	}
        	System.out.println(winner+1);
        	tc--;
        }
    }
    public static int findBackward(int i,int[] heights){
    	int output =0;
    	int currHeight = heights[i];
    	for(int k=i-1;k>=0;k--){
    		if(heights[k]>=currHeight){
    			break;
    		}
    		else{
    			output++;
    		}
    	}
    	return output;
    }
    public static int findForward(int i,int[] heights){
    	int output =0;
    	int currHeight = heights[i];
    	int n = heights.length;
    	for(int k=i+1;k<n;k++){
    		if(heights[k]>=currHeight){
    			break;
    		}
    		else{
    			output++;
    		}
    	}
    	return output;
    }
}
