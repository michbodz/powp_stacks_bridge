package edu.kis.vh.stacks.list;

public class StackList {

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

	public boolean empty() {
		return lastNode == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (empty())
			return -1;
		return lastNode.value;
	}

	public int pop() {
		if (empty())
			return -1;
		int itemRecievedFromPop = lastNode.value;
		lastNode = lastNode.prev;
		return itemRecievedFromPop;
	}

}
