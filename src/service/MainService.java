package service;

import java.util.ArrayList;

import datastr.MyLinkedList;
import model.Student;

public class MainService {
	public static void main(String[] arg) {
		MyLinkedList<Character> symbols = new MyLinkedList<Character>();
		MyLinkedList<Student> students = new MyLinkedList<Student>();
		try {
			symbols.add('a');	
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
			System.out.println("search============");
			ArrayList<Integer> positions = new ArrayList<Integer>();
			positions = symbols.search('a');
			System.out.print(positions);
			System.out.println("atbrivot sarakstu============");
			symbols.makeEmpty();
			symbols.add('P');
			symbols.print();
			
			System.out.println("Studenti============");
			students.add(new Student("Janis", "Berzins", "123456-12345"));
			students.add(new Student("Juris", "Sesks", "123455-12345"));
			students.add(new Student("Levis", "Ozols", "123466-12345"));
			students.add(new Student("Janis", "Berzins", "123456-12345"));
			students.print();
			System.out.println("search============");
			ArrayList<Integer> positions1 = new ArrayList<Integer>();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
