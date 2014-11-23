package org.saftware.datastructures;

public interface StackInterface {

	public boolean push(int item);
	public int pop();
	public int peek();
	public int getCount();
	public boolean isEmpty();
	public boolean isFull();
}
