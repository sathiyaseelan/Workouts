package org.saftware.hackerearth.project_team;


import java.util.Arrays;
import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
       */
       
        Scanner in = new Scanner(System.in);
        int t =  in.nextInt();
        while(t>0){
        	int n = in.nextInt();
        	int[] klist = new int[n];
        	for(int i=0;i<n;i++){
        		klist[i] = in.nextInt();
        	}
        	Arrays.sort(klist);
        	int[] team = new int[n/2];
        	for(int i=0,j=n-1;i<=(n/2)-1 && j>=n/2;i++,j--){
        		team[i] = klist[i] +klist[j];
        	}
        	Arrays.sort(team);
        	
        	System.out.println(team[(n/2)-1] -team[0]);
        	t--;
        }
 

        
    }
}
