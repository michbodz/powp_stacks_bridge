package edu.kis.vh.stacks;

public class StackFIFO extends Stack {

	private final Stack temp = new Stack();
	
	public StackFIFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackFIFO(IStack stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int pop() {
		while (!isEmpty())			
			temp.push(super.pop());
		
		int itemRecievedFromPop = temp.pop();
		
		while (!temp.isEmpty())	
			push(temp.pop());
		
		return itemRecievedFromPop;
	}
}
