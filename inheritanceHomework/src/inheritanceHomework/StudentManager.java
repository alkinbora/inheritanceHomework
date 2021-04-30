package inheritanceHomework;

public class StudentManager extends UserManager{
	
	public void courses(Student student) {
		System.out.println("Alınan Kurslar: " + student.registeredCourses);
	}

}
