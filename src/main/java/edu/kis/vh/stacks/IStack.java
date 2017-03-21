package edu.kis.vh.stacks;

public interface IStack {

	void push(int recievedItem);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}