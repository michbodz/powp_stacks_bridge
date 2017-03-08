package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {
	
	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		testStacks(factory);
	}

	private static void testStacks(DefaultStacksFactory factory) {
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			stacks[3].push(rn.nextInt(20));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
	}	
}
//linie 19-27 o jeden tab za dużo, linie 28-29 polaczone w jedna, 25 linia o jeden tab za dużo, usuniete zbedne puste linie po 28 i po 29  
//alt + <-  /  alt + ->  -  przelacza miedzy miejscami, na których skończyłem pracę w danym pliku w kolejności takiej jak je kończyłem