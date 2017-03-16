package edu.kis.vh.stacks;

public class Stack {
	private static final int EMPTY_STACK_VALUE = -1;
	private static final int FULL_STACK_VALUE = 11;
	private static final int STACK_SIZE_VALUE = 12;	
	
	private final int[] ITEMS = new int[STACK_SIZE_VALUE];
	private int total = EMPTY_STACK_VALUE;
	private StackArray stackArray;

		
	public Stack(int total, StackArray stackArray) {
		super();
		this.total = total;
		this.stackArray = stackArray;
	}
	
	public Stack() {
		this.stackArray = new StackArray();
	}

	public int getTotal() {
		return stackArray.getTotal();
	}

	public void push(int recievedItem) {
		stackArray.push(recievedItem);
	}

	public boolean isEmpty() {
		return stackArray.isEmpty();
	}

	public boolean isFull() {
		return stackArray.isFull();
	}

	public int top() {
		return stackArray.top();
	}

	public int pop() {
		return stackArray.pop();
	}
			
}
