package inheritanceHomework;


public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demirog", "engindemirog@gmail.com", "Ankara", 20000);
		
		Instructor instructor2 = new Instructor(2, "Mustafa Murat", "Co�kun", "mustafacoskun@gmail.com", "�stanbul", 15000);
		
		Student student1 = new Student(3, "Alk�n Bora", "U�ak", "alkinbora287@gmail.com", 123, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
		Student student2 = new Student(4, "Emre", "Baltac�", "emre0697@gmail.com", 456, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR), Programlamaya Giri� ��in Temel Kurs");
		Student student3 = new Student(5, "Ege", "Ayta�", "egemel2000a@hotmail.com", 789, "Programlamaya Giri� ��in Temel Kurs");
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		System.out.println("Ho�geldiniz..");
		System.out.println("------------------------------------------------");
		System.out.println("E�itmenlerimiz");
		userManager.list(instructor1); 
		userManager.list(instructor2); 
		System.out.println("------------------------------------------------");
		System.out.println("��rencilerimiz ve Kay�tl� Olduklar� Kurslar");
		userManager.list(student1);
		studentManager.courses(student1);
		userManager.list(student2);
		studentManager.courses(student2);
		userManager.list(student3);
		studentManager.courses(student3);
		System.out.println("------------------------------------------------");
		System.out.println("E�itmenlerimizin �leti�im Bilgileri");
		userManager.list(instructor1);
		instructorManager.contact(instructor1);
		userManager.list(instructor2);
		instructorManager.contact(instructor2);
		
	
	}

}
