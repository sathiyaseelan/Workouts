package org.saftware.datastructures;

public class Stack implements StackInterface {

	private int[] items ;
	private int top=-1;
	private int capacity;
	public Stack(){
		this.capacity = 20;
		items = new int[capacity];
	}
	public Stack(int capacity){
		this.capacity = capacity;
		items = new int[capacity];
	}

	public static void main(String[] args) {
		Stack books = new Stack();
		books.push(1);
		books.push(10);
		books.push(100);
		System.out.println(books.peek());
		System.out.println(books.pop());
		System.out.println(books.peek());
		System.out.println(books.pop());
		System.out.println(books.getCount());
	}

	@Override
	public boolean push(int item) {
		boolean isSuccess = false;
		if(!isFull()){
			items[++top] = item;
			isSuccess = true;
		}
		return isSuccess;
	}

	@Override
	public int pop() {
		int item =0;
		if(!isEmpty()){
			item = items[top--];
		}
		return item;
	}

	@Override
	public int peek() {
		if(!isEmpty()){
		return items[top];
		}
		else{
			return 0;
		}
	}

	@Override
	public int getCount() {
		return top+1;
	}

	@Override
	public boolean isEmpty() {
		return (top==-1);
	}

	@Override
	public boolean isFull() {
		return (top== capacity-1);
	}

}
