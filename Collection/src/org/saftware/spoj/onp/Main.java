package org.saftware.spoj.onp;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		while(tc>0){
			char[] input = br.readLine().toCharArray();
			String output ="";
			Stack stack = new Stack(input.length);
			for(int i=0;i<input.length;i++){
				if(isOperand(input[i])){
					output+=input[i];
				}else{
					char operator = input[i];
					if(stack.isEmpty()){
						stack.push(operator);
					}else if(operator=='('){
						stack.push(operator);
					}else if(operator == ')'){
						while(stack.peek()!='('){
							output+=stack.pop();
						}
						stack.pop();
					}
					else{
						char topChar = stack.peek();
						if(isLower(topChar, operator)){
							stack.push(operator);
						}else{
							while(!isLower(stack.peek(), operator)){
								output+=stack.pop();
							}
						}
					}
				}
				
			}
			System.out.println(output);
			tc--;
		}
	}

	public static boolean isLower(char left,char right){
		String operators = "+-*/^";
		return (operators.indexOf(left)<operators.indexOf(right));
	}
	
	public static boolean isOperand(char item){
		String temp =""+item;
		return temp.matches("[a-z]");
	}
}


class Stack {

	private char[] items ;
	private int top=-1;
	private int capacity;
	public Stack(){
		this.capacity = 20;
		items = new char[capacity];
	}
	public Stack(int capacity){
		this.capacity = capacity;
		items = new char[capacity];
	}


	public boolean push(char item) {
		boolean isSuccess = false;
		if(!isFull()){
			items[++top] = item;
			isSuccess = true;
		}
		return isSuccess;
	}

	public char pop() {
		char item =0;
		if(!isEmpty()){
			item = items[top--];
		}
		return item;
	}

	public char peek() {
		if(!isEmpty()){
		return items[top];
		}
		else{
			return 0;
		}
	}

	public int getCount() {
		return top+1;
	}

	public boolean isEmpty() {
		return (top==-1);
	}

	public boolean isFull() {
		return (top== capacity-1);
	}

}
