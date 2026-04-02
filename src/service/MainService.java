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
			symbols.add('s', 5);
			symbols.print();
			System.out.println("dzesana============");
			symbols.remove(0);
			symbols.print();
			symbols.remove(5);
			symbols.print();
			symbols.remove(2);
			symbols.print();
			System.out.println("getbyposition============");
			System.out.println(symbols.getByPosition(2));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
