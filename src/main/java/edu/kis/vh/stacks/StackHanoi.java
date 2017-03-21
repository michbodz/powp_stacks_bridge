package edu.kis.vh.stacks;

/**
 * @author Michał Bodzioch
 *
 */
public class StackHanoi extends Stack {

	private int totalRejected = 0;
	
	public StackHanoi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackHanoi(IStack stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

	/**
	* Metoda reportRejected zwraca nam informacje o całkowitej ilości elementów odrzuconych	* 
	* @return liczba elementów, które zostały do tej pory odrzucone
	*/
	public int reportRejected() {
		return totalRejected;
	}
	
	@Override
	public void push(int recievedItem) {
		if (!isEmpty() && recievedItem > top())
			totalRejected++;
		else
			super.push(recievedItem);
	}
}
