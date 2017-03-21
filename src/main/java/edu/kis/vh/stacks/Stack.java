package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class Stack {
	//dzięki zmianom możemy obsłużyć dowolny obiekt, który implementuje interfejs IStack
	private IStack stack;
		
	public Stack(IStack stack) {
		super();		
		this.stack = stack;
	}
	
	public Stack() {
		this.stack = new StackList();
	}

	public void push(int recievedItem) {
		stack.push(recievedItem);
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int top() {
		return stack.top();
	}

	public int pop() {
		return stack.pop();
	}
			
}
