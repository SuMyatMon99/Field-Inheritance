package FieldInheritance;

class Staff extends Person {
	String school;
	double pay;
	
	public Staff(String name, String address, String school, double pay) {
		super(Person.getName(), Person.getAddress());
		
		this.school = school;
		this.pay = pay;
	}
	
	public void staffInfo() {
		System.out.println("Staff Name: " + Person.getName());
		System.out.println("Address: " + Person.getAddress());
		System.out.println("School: " + school);
		System.out.println("Pay: " + pay + '\n');
	}

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("Aye Aye");
		p.setAddress("Monywa");
		System.out.println(p.toString());
		
		Staff s = new Staff(Person.getName(), Person.getAddress(), "UCS" , 2000);
		s.staffInfo();
		
	}

}
