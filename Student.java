package FieldInheritance;

public class Student extends Person{
	String program;
	int year;
	double fee;
	public Student() {}
	public Student(String name, String address, String program, int year, double fee) {
		super(Person.getName(), Person.getAddress());
		
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	public void stdInfo() {
		System.out.println("Name: " + Person.getName());
		System.out.println("Address: " + Person.getAddress());
		System.out.println("Program: " + program);
		System.out.println("Year: " + year);
		System.out.println("Fee: " + fee + '\n');
	}
	
public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("SuMyat");
		p.setAddress("Monywa");
		System.out.println(p.toString());
		
		Student std = new Student(Person.getName(), Person.getAddress(), "asdfg" , 2, 20000);
		std.stdInfo();
		
	}
}
