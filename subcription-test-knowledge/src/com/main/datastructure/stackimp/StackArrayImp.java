package com.main.datastructure.stackimp;

public class StackArrayImp {
	
	public static void main(String[] args) {
		try {
			StackArray stackArray = new StackArray();
			System.out.println(stackArray.isEmpty());
			stackArray.push(4);
			stackArray.push(5);
			stackArray.push(3);
			stackArray.push(6);
			stackArray.push(2);
			stackArray.push(7);
			stackArray.push(1);
			stackArray.displayContent();
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}

class StackArray {
	private static final int arrStackSize = 5;
	private int[] arrStack = new int[arrStackSize];
	private int top; //it will hold index of recent inserted element in Stack.
	
	StackArray() {
		this.top = -1;
	}
	
	//get the top element and remove that from stack
	public int pop() throws StackIsEmptyException{
		if(isEmpty())
			throw new StackIsEmptyException("The Stack is Empty");
		return 0;
	}
	
	//push new element to the stack
	public void push(int key) throws StackOverFlowException {
		if(isEmpty()) {
			top++;
			arrStack[top] = key;
			return;
		} else {
			top++;
			if(isFull())
				throw new StackOverFlowException("Stack is OverFlow");
			arrStack[top] = key;
		}
			
	}
	
	//get the top element without remove it from stack
	public int peek() throws StackIsEmptyException {
		if(isEmpty())
			throw new StackIsEmptyException("The Stack is Empty");
		else 
			return arrStack[top];
	}
	
	//whether stack is empty or not
	public boolean isEmpty() {
		return top < 0;
	}
	
	public boolean isFull() {
		return top > arrStackSize-1; 
	}
	
	//Push element in Asc order in Stack
	public void pushAscOrder(int key) {
		
	}
	
	public void displayContent() {
		int size = arrStackSize;
		System.out.println("---Content of Stack---");
		while(size !=0) {
			size--;
			System.out.println(arrStack[size]);
		}
	}
}
