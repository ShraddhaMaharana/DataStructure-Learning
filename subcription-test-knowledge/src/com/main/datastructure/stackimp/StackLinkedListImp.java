package com.main.datastructure.stackimp;
/*
 * Stack is LIFO-Last in First Out case. Top always points to the last/recent inserted element.
 * 
 * */
public class StackLinkedListImp {
	static Node top;
	
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//get print and remove the Top element
	public static int pop() throws StackIsEmptyException {
		if(isEmpty()) {
			throw new StackIsEmptyException("Stack is empty");
		} else {
			int data = top.data;
			top = top.next;
			return data;
		}
	}
	
	//Insert new key at the  top of stack
	public static void push(int key) {
		if(isEmpty()) {
			top = new Node(key);
		} else {
			Node temp = top;
			top = new Node(key);
			top.next = temp;
		}
	}
	
	//Print top element but dont remove it from Stack
	public static int peek() throws StackIsEmptyException {
		if(isEmpty())
			throw new StackIsEmptyException("Stack is empty");
		else
			return top.data;
	}
	
	//Check whether Stack is empty or not
	public static boolean isEmpty() {
		return (top == null);
	}
	
	//Determine total size of Stack
	public static int stackSize() {
		Node start = top;
		int count = 0;
		while (start != null) {
			count ++;
			start = start.next;
		}
		return count;
			
	}
	
	public static void main(String[] args) {
		try {
			push(8);
			push(5);
			push(9);
			System.out.println("Stack size = "+stackSize());
			System.out.println("Top value is "+ pop());
			System.out.println("Peek value "+ peek());
			
		} catch(StackIsEmptyException stackIsEmptyException) {
			System.out.println(stackIsEmptyException.toString());
		}
	}

}
