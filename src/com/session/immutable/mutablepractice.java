package com.session.immutable;

final class artsStudent {

	final private int rollno;
	final private String Studentname;
	final private Address address;

	public artsStudent(int rollno, String studentname, Address address) {
		this.rollno = rollno;
		this.Studentname = studentname;
		this.address = address;
	}

	public int getRollno() {
		return rollno;
	}

	public String getStudentname() {
		return Studentname;
	}

	public Address getAddress() {
		// return address;
		// return new Address(address.getCity(), address.getState(),
		// address.getCountry());
		return new Address(address);

	}

	@Override
	public String toString() {
		return "artsStudent [rollno=" + rollno + ", Studentname=" + Studentname + ", address=" + address + "]";
	}

}

public class mutablepractice {

	public static void main(String[] args) {

		Address homeaddress = new Address("Chennai", "TN", "India", "Asia");
		artsStudent gowtham = new artsStudent(1, "Gowtham", homeaddress);
		System.out.println(gowtham);
		Address newaddress = gowtham.getAddress();
		newaddress.setCity("HYD");
		newaddress.setState("AP");
		System.out.println(gowtham);
	}
}
