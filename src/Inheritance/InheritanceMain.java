package Inheritance;

import java.util.Scanner;

public class InheritanceMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Enter your gender: ");
		String gender = sc.nextLine();
		System.out.println("Enter your Blood Group: ");
		String bloodGroup = sc.nextLine();
		System.out.println("Enter your address: ");
		String address = sc.nextLine();
		
		//InheritanceStudent stu = new InheritanceStudent("Vishal Kumar", 22, "Male", "B+", "Patna");
		InheritanceStudent stu = new InheritanceStudent(name, age, gender, bloodGroup, address);
		stu.display();
		
		InheritedStudentClass stu1 = new InheritedStudentClass(name, age, gender, bloodGroup, address);
		stu1.read();
		stu1.college();
		stu1.display();
	}

}
