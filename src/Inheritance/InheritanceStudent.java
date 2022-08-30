package Inheritance;

public class InheritanceStudent {
	String name;
	int age;
	String gender;
	String bloodGroup;
	String address;
	
	public InheritanceStudent(String name, int age, String gender, String bloodGroup, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.address = address;
	}

	public InheritanceStudent(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("My name is " + name + " , I am " + age + " years old");
		System.out.println("I am a " + gender + " and my blood group is " + bloodGroup);
		System.out.println("My address is " + address);
	}
	
	
}
