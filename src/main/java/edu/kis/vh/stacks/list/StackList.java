package edu.kis.vh.stacks.list;

public class StackList {
	class Node {
		// zamiast odwolywania sie do danego atrybutu w klasie StackList, uzywane sa teraz gettery, lub settery zwiazane z tym atrybutem
		private final int value;
		private Node prev;
		private Node next;

		public Node(int receivedValue) {
			value = receivedValue;
		}

		public int getValue() {
			return value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
	}
	
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
