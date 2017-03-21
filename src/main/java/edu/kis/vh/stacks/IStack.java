package edu.kis.vh.stacks;

public interface IStack {
	//Tak, realizacja zadania 10 pomogła mi w zmianie wartości zwracanej przez peek i pop, ponieważ musiałem ją zmienić tylko w jednym wspólnym interfejsie
	public static final int EMPTY_STACK_VALUE = 0;
	
	void push(int recievedItem);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}