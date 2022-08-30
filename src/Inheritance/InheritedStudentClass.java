package Inheritance;

public class InheritedStudentClass extends InheritanceStudent {
	public InheritedStudentClass(String name, int age, String gender, String bloodGroup, String address) {
		super(name, age, gender, bloodGroup, address);
		// TODO Auto-generated constructor stub
	}

	public void read() {
		System.out.println("I am a student of Btech CSE");
	}
	
	public void college() {
		System.out.println("I am a student of Bharath University");
	}

}
