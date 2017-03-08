package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void push(int recievedItem) {
		if (!isEmpty() && recievedItem > top())
			totalRejected++;
		else
			super.push(recievedItem);
	}
}
