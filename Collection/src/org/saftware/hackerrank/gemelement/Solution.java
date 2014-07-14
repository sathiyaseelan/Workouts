package org.saftware.hackerrank.gemelement;


import java.util.Scanner;


public class Solution {
   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int _N = in.nextInt();
       String[] _rocks = new String[_N];
       for(int i=0;i < _N ;i++){
    	   _rocks[i] = in.next();
       }
       int _element = 97;
       int _numberOfGems = 0;
       while(_element <=122){
    	   
    	   boolean isGemElement =true;
    	   for(int i=0;i < _N ;i++){
        	   if(!(_rocks[i].contains(Character.toString((char) _element)))){
        		   isGemElement = false;
        		   break;
        	   }
        	   
           }
    	   if(isGemElement){
    		_numberOfGems++;   
    	   }
    	   _element++;
       }
       System.out.println(_numberOfGems);
       
   }
 
 
}
