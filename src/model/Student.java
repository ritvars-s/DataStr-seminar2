package model;

//modelu klase 
public class Student implements Comparable<Student>{
	//mainigie
	
	private long studentID;
	private String name;
	private String surname;
	private String personCode;
	
	private static long counter = 0;

	public long getStudentID() {
		return studentID;
	}
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	public String getPersonCode() {
		return personCode;
	}
	
	//set ==============
	public void setStudentID() {
		studentID = counter;
		counter++;
	}
	public void setName(String newName) {
		if((newName != null) && (!newName.isEmpty()) && (newName.matches("[A-Z]{1}[a-z]{2,20}([ ]{1}[A-Z]{1}[a-z]{2,20})?"))) {
			name = newName;
		}
		else {
			name = "Unknown";
		}
	}
	public void setSurname(String newSurname) {
		if((newSurname != null) && (!newSurname.isEmpty()) && (newSurname.matches("[A-Z]{1}[a-z]{2,20}([-]{1}[A-Z]{1}[a-z]{2,20})?"))) {
			surname = newSurname;
		}
		else {
			surname = "Unknown";
		}
		
	}
	public void setPersonCode(String newPersonCode){
		if ( (!newPersonCode.isEmpty()) && (newPersonCode != null) && (newPersonCode.matches("[1-9]{6}[-]{1}[1-9]{5}"))) {
			personCode = newPersonCode;
		}
		else {
			personCode = "Unknown";
		}
	}
	
	//bezargumenta konst
	public Student() {
		setStudentID();
		setName("Janis");
		setSurname("Kalnins");
		setPersonCode("240051-21441");
	};
	//argumenta konst
	public Student(String newName, String newSurname, String newPersonCode) {
		setStudentID();
		setName(newName);
		setSurname(newSurname);
		setPersonCode(newPersonCode);
	}
	//toString funkcija
	@Override //var nerakstit bet tapat parrakstis klases toString funkciju
	public String toString() {
		String result = studentID + ": " + name + " " + surname + " (" + personCode + ")"; 
		return result;
	}
	public int compareTo(Student student2) {
		if(surname.charAt(0) > student2.getSurname().charAt(0)) {
			return 1;
		}
		else if (surname.charAt(0) < student2.getSurname().charAt(0)){
			return -1;
		}
		else {//ja abiem studentiem sakas ar veinu un to pasu burtu
			return 0;
		}
		
	}
	//visas parejas funkcijas pec nepieciesamibas
}
