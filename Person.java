package FieldInheritance;

public class Person {
	private static String name;
	private static String address;
	
	public Person() {}
	public Person(String name, String address) {
		Person.name = name;
		Person.address = address;
	}

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		Person.name = name;
	}

	public static String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		Person.address = address;
	}
	public String toString() {
		return "Name: " + name + '\n' + "Address: " + address + '\n';
	}
}
