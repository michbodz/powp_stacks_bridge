package edu.kis.vh.stacks.type;

import edu.kis.vh.stacks.IStack;

public class StackList implements IStack{
	class Node {
		// zamiast odwolywania sie do danego atrybutu w klasie StackList, uzywane sa teraz gettery, lub settery zwiazane z tym atrybutem
		// uzywalem opcji Source → Generate Delegate Methods
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
	
	private Node lastNode;

	public void push(int elementToPush) {
		if (lastNode == null)
			lastNode = new Node(elementToPush);
		else {
			lastNode.setNext(new Node(elementToPush));
			lastNode.getNext().setPrev(lastNode);
			lastNode = lastNode.getNext();
		}
	}

	public boolean isEmpty() {
		return lastNode == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return lastNode.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		int itemRecievedFromPop = lastNode.getValue();
		lastNode = lastNode.getPrev();
		return itemRecievedFromPop;
	}

}
