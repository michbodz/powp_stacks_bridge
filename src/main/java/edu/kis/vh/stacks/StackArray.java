package edu.kis.vh.stacks;

public class StackArray {
	private static final int EMPTY_STACK_VALUE = -1;
	private static final int FULL_STACK_VALUE = 11;
	private static final int STACK_SIZE_VALUE = 12;	
	
	private final int[] ITEMS = new int[STACK_SIZE_VALUE];
	private int total = EMPTY_STACK_VALUE;
	
	public int getTotal() {
		return total;
	}

	public void push(int recievedItem) {
		if (!isFull()) {			
			ITEMS[++total] = recievedItem;
		}
	}
	
	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}
		
	public boolean isFull() {
		return total == FULL_STACK_VALUE;
	}
			
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return ITEMS[total];
	}
				
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		
		return ITEMS[total--];
	}
}