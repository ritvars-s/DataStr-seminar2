package datastr;

import java.util.ArrayList;

public class MyLinkedList<Ttype> {
	
	private MyNode<Ttype> firstNode = null;
	private MyNode<Ttype> lastNode = null;
	private int howManyElements = 0;
	
	public int getHowManyElements() {
		return howManyElements;
	}
	
	//bezargumenta konstruktors bus no object klases
	
	public boolean isEmpty() {
		return (howManyElements == 0);
	}
	public boolean isFull() {
		try {
			new MyNode<Character>('A'); //meginu ram atmina rezervet vietu
			return true;
		}
		catch(OutOfMemoryError e){
			return false;
		}
		
	}
	
	public void add(Ttype newElement) throws Exception{
		if (isFull()) {
			throw new Exception("Saraksts ir pilns");
		}
		if(newElement.equals(null)) {
			throw new Exception("Padotais elements nevar but null");
		}
		if(isEmpty()) {
			MyNode<Ttype> newNode = new MyNode<Ttype>(newElement);
			lastNode = newNode;
			firstNode = newNode;
			howManyElements++;
			}
		else {
			MyNode<Ttype> newNode= new MyNode<Ttype>(newElement);
			lastNode.setNextNode(newNode);
			newNode.setPreviousNode(lastNode);
			
			lastNode = newNode;
			howManyElements++;
		}
		
		
	}
	public void print() throws Exception {
		if(isEmpty()) {
			throw new Exception("Saraksta nav elementu ko printet");
		}
		MyNode<Ttype> currentNode = firstNode;
		while (currentNode != null) {
			System.out.print(currentNode.getElement());
			currentNode = currentNode.getNextNode();
		}
		System.out.println();
	}
	
}
