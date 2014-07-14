package org.saftware.hackerrank.servicelane;


import java.util.Scanner;


public class Solution {


  
   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _N = in.nextInt();
        int _T = in.nextInt();
        int[] _laneWidth = new int[_N];
        for(int i=0; i<_N ;i++){
        	_laneWidth[i] = in.nextInt();
        }
        while(_T!=0){
        	int i = in.nextInt();
        	int j = in.nextInt();
        	System.out.println(findMin(i, j, _laneWidth));
        	_T--;
        }
   }
 
 static int findMin(int i, int j, int[] _laneWidth){
	 int min=_laneWidth[i];
	 i++;
	 while(i<=j){
		 if(_laneWidth[i] < min){
			 min = _laneWidth[i];
		 }
			 i++;
	 }
	 return min;
 }
}
