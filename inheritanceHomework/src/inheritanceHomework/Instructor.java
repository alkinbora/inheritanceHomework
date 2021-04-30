package inheritanceHomework;

public class Instructor extends User{
	String address;
	int salary;
	public Instructor(int id, String firstName, String lastName, String email, String address, int salary) {
		super(id, firstName, lastName, email);
		this.address = address;
		this.salary = salary;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
