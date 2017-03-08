package edu.kis.vh.stacks.list;

public class StackList {

	private static final int EMPTY_STACK_VALUE = -1;
	private Node lastNode;

	public void pushElement(int elementToPush) {
		if (lastNode == null)
			lastNode = new Node(elementToPush);
		else {
			lastNode.setNext(new Node(elementToPush));
			lastNode.getNext().setPrev(lastNode);
			lastNode = lastNode.getNext();
		}
	}

	private boolean empty() {
		return lastNode == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (empty())
			return EMPTY_STACK_VALUE;
		return lastNode.getValue();
	}

	public int pop() {
		if (empty())
			return EMPTY_STACK_VALUE;
		int itemRecievedFromPop = lastNode.getValue();
		lastNode = lastNode.getPrev();
		return itemRecievedFromPop;
	}

}
