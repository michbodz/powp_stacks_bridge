package edu.kis.vh.stacks.list;

public class StackList {

	private static final int EMPTY_STACK_VALUE = -1;
	Node lastNode;

	public void pushElement(int elementToPush) {
		if (lastNode == null)
			lastNode = new Node(elementToPush);
		else {
			lastNode.next = new Node(elementToPush);
			lastNode.next.prev = lastNode;
			lastNode = lastNode.next;
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
		return lastNode.value;
	}

	public int pop() {
		if (empty())
			return EMPTY_STACK_VALUE;
		int itemRecievedFromPop = lastNode.value;
		lastNode = lastNode.prev;
		return itemRecievedFromPop;
	}

}
