package edu.kis.vh.stacks;

import edu.kis.vh.stacks.type.StackList;

public class StackFIFO extends Stack {

	private final Stack temp = new Stack(new StackList());
	//Najlepszym wyborem bedzie StackList, poniewaz bardziej nadaje sie do FIFO, ze wzgledu na usuwanie elementow
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
