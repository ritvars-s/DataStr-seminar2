package datastr;

public class MyNode<Ttype> {
	private Ttype element;
	private MyNode nextNode = null;
	private MyNode previousNode = null;
	
	public Ttype getElement() {
		return element;
	}
	
	public MyNode getNextNode() {
		return nextNode;
	}
	public MyNode getPreviousNode() {
		return previousNode;
	}
	
	public void setElement(Ttype newElement) {
		if (!newElement.equals(null)) {
			element = newElement;	
		}
		else {
			element = (Ttype)new Object();
		}
		
	}
	public void setNextNode(MyNode newNextNode) {
		nextNode = newNextNode;
	}
	
	public void setPreviousNode(MyNode newPreviousNode) {
		previousNode = newPreviousNode;
	}
	
	public MyNode(Ttype newElement) {
		setElement(newElement);
	}
	public String toString() {
		return "" + element;
	}
	
}
