package edu.kis.vh.stacks;

import edu.kis.vh.stacks.type.StackList;

public class Stack {
	//dzięki zmianom możemy obsłużyć dowolny obiekt, który implementuje interfejs IStack
	//F3 przenosi do deklaracji metod znajdujacych sie w interfejsie IStack
	//Navigate -> Open Declaration - pokazuje nam typy implementujace, lub definiujace dana metode, a po wybraniu jednej z nich przenosi nas do danego miejsca
	//Nacisniety ctrl przy pracy kursora myszki - mozemy otworzyc deklaracje, lub implementacje wybranej metody
	private IStack stack;
		
	public Stack(IStack stack) {
		super();		
		this.stack = stack;
	}
	
	public Stack() {
		this.stack = new StackList();
	}

	public void push(int recievedItem) {
		stack.push(recievedItem);
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int top() {
		return stack.top();
	}

	public int pop() {
		return stack.pop();
	}
			
}
