package service;

import datastr.MyLinkedList;

public class MainService {
	public static void main(String[] arg) {
		MyLinkedList<Character> symbols = new MyLinkedList<Character>();
		try {
			symbols.add('a');	
			symbols.add('b');	
			symbols.add('c');	
			symbols.add('d');
			symbols.print();
			symbols.add('x', 0);
			symbols.print();
			symbols.add('x', 5);
			symbols.print();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
