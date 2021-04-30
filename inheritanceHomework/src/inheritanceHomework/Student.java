package inheritanceHomework;

public class Student extends User{
	int studentNumber;
	String registeredCourses;
	
	public Student(int id, String firstName, String lastName, String email, int studentNumber, String registeredCourses) {
		super(id, firstName, lastName, email);
		this.studentNumber = studentNumber;
		this.registeredCourses = registeredCourses;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(String registeredCourses) {
		this.registeredCourses = registeredCourses;
	}

}
