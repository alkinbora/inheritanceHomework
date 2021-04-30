package inheritanceHomework;


public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demirog", "engindemirog@gmail.com", "Ankara", 20000);
		
		Instructor instructor2 = new Instructor(2, "Mustafa Murat", "Coþkun", "mustafacoskun@gmail.com", "Ýstanbul", 15000);
		
		Student student1 = new Student(3, "Alkýn Bora", "Uçak", "alkinbora287@gmail.com", 123, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");
		Student student2 = new Student(4, "Emre", "Baltacý", "emre0697@gmail.com", 456, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR), Programlamaya Giriþ Ýçin Temel Kurs");
		Student student3 = new Student(5, "Ege", "Aytaç", "egemel2000a@hotmail.com", 789, "Programlamaya Giriþ Ýçin Temel Kurs");
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		System.out.println("Hoþgeldiniz..");
		System.out.println("------------------------------------------------");
		System.out.println("Eðitmenlerimiz");
		userManager.list(instructor1); 
		userManager.list(instructor2); 
		System.out.println("------------------------------------------------");
		System.out.println("Öðrencilerimiz ve Kayýtlý Olduklarý Kurslar");
		userManager.list(student1);
		studentManager.courses(student1);
		userManager.list(student2);
		studentManager.courses(student2);
		userManager.list(student3);
		studentManager.courses(student3);
		System.out.println("------------------------------------------------");
		System.out.println("Eðitmenlerimizin Ýletiþim Bilgileri");
		userManager.list(instructor1);
		instructorManager.contact(instructor1);
		userManager.list(instructor2);
		instructorManager.contact(instructor2);
		
	
	}

}
