package inheritanceHomework;

public class InstructorManager extends UserManager{
	
	public void contact(Instructor instructor) {
		System.out.println("E-Mail: " + instructor.email);
	}

}
