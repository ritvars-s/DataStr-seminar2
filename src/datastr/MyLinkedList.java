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
			return false;
		}
		catch(OutOfMemoryError e){
			return true;
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
	//izveidot add funkciju kura padod elementu un poziciju kura ielikt sakuma
	//izveidot add funkciju pa vidu
	
	public void add(Ttype newElement, int position) throws Exception{
		if (isFull()) {
			throw new Exception("Saraksts ir pilns");
		}
		if(newElement.equals(null)) {
			throw new Exception("Padotais elements nevar but null");
		}
		if (position < 0) {
			throw new Exception("Pozicija nevar but mazaka par 0");
		}
		if (position > howManyElements) {
			throw new Exception("Pozicija nevar but lielaka par elementu skaitu");
		}
		if(isEmpty()) {
			MyNode<Ttype> newNode = new MyNode<Ttype>(newElement);
			lastNode = newNode;
			firstNode = newNode;
			howManyElements++;
		}
		//preksa
		if(position == 0) {
			MyNode<Ttype> newNode= new MyNode<Ttype>(newElement);
			
			firstNode.setPreviousNode(newNode);
			newNode.setNextNode(firstNode);
			
			firstNode = newNode;
			howManyElements++;
		}
		//beigas
		else if(position == howManyElements){
			add(newElement);
		}
		// pavidu
		else {
			MyNode<Ttype> newNode = new MyNode<Ttype>(newElement);
			
			MyNode<Ttype> currentNode = firstNode;
			

			for (int i = 1; i <= position - 1; i++) {
				currentNode = currentNode.getNextNode();	
			}
			MyNode<Ttype> leftNode = currentNode;
			MyNode<Ttype> rightNode = currentNode.getNextNode();
			
			leftNode.setNextNode(newNode);
			newNode.setPreviousNode(leftNode);
			newNode.setNextNode(rightNode);
			rightNode.setPreviousNode(newNode);
			howManyElements++;
		}
	}
	public void remove(int position) throws Exception{
		if (isEmpty()) {
			throw new Exception("Ir tukss");
		}
		if (position >= howManyElements) {
			throw new Exception("Pozicija nevar but lielaka par elemntu skaitu");
		}
		if (position < 0) {
			throw new Exception("Pozicija newvar but mazaka par 0");
		}
		if (position == 0) {
			firstNode = firstNode.getNextNode();
			firstNode.setPreviousNode(null);
			howManyElements--;
		}
		else if (position == howManyElements - 1) {
			lastNode = lastNode.getPreviousNode();
			lastNode.setNextNode(null);
			howManyElements--;
		}
		else {
			MyNode<Ttype> currentNode = null;
			if(howManyElements / 2 > position) {
				currentNode = firstNode;
				for (int i = 1; i <= position; i++) {
					currentNode = currentNode.getNextNode();	
				}
			}
			
			else{
				currentNode = lastNode;
				for (int i = howManyElements; i > position + 1; i--) {
					currentNode = currentNode.getPreviousNode();	
				}
				
			}
			
			MyNode<Ttype> leftNode = currentNode.getPreviousNode();
			MyNode<Ttype> rightNode = currentNode.getNextNode();
			leftNode.setNextNode(rightNode);
			rightNode.setPreviousNode(leftNode);
			howManyElements--;
		}
	}
	//get by position
	
	public Ttype getByPosition(int position) throws Exception{
		if (isEmpty()) {
			throw new Exception("Ir tukss");
		}
		if (position >= howManyElements) {
			throw new Exception("Pozicija nevar but lielaka par elemntu skaitu");
		}
		if (position < 0) {
			throw new Exception("Pozicija newvar but mazaka par 0");
		}
		if (position == 0) {
			return firstNode.getElement();
		}
		else if (position == howManyElements - 1) {
			return lastNode.getElement();
		}
		else {
			MyNode<Ttype> currentNode = firstNode;
			for (int i = 1; i <= position; i++) {
				currentNode = currentNode.getNextNode();	
			}
			return currentNode.getElement();
		}
	}
	public ArrayList<Integer> search(Ttype element) throws Exception{
		if (isEmpty()) {
			throw new Exception("Ir tukss");
		}
		ArrayList<Integer> allPositions = new ArrayList<Integer>();
		MyNode<Ttype> currentNode = firstNode;
		for (int i = 0; i < howManyElements; i++) {
			if (element == currentNode.getElement()) {
				allPositions.add(i);
			}
			currentNode = currentNode.getNextNode();	
		}
		if (allPositions.isEmpty()) {
			throw new Exception("Nav neviena tada elementa");
		}
		return allPositions;
	}
	
	//search
	//makeEmpty
	
}
