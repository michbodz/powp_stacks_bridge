package edu.kis.vh.stacks.list;

public class Node {
	// zamiast odwolywania sie do danego atrybutu w klasie StackList, uzywane sa teraz gettery, lub settery zwiazane z tym atrybutem
	private int value;
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
