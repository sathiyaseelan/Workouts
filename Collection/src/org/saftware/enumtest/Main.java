package org.saftware.enumtest;

class Super{
	public void display(){
		System.out.println("www");
	}
}

class  sub extends Super{
	public void display(){
		System.out.println("qwqw");
	}
}
	public class Main {
		
		
	   public static void main(String args[]){
	      System.out.println("All car prices:");
	  sub subr = (sub) new Super();
	  subr.display();
	  
	}
	}