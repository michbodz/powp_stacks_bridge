package edu.kis.vh.stacks;

public interface IStack {
	
	public static final int EMPTY_STACK_VALUE = -1;
	
	void push(int recievedItem);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}