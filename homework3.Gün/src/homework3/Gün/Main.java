package homework3.G�n;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.firsName = "Talha ";
		student.lastName = "I��kl�";
		student.address = "abcd ";
		student.course = "Java";
		
		
		Instructor instructor = new Instructor();
		instructor.firsName = "Engin ";
		instructor.lastName = "Demiro�";
		
		
		UserManager userManager = new UserManager();
		userManager.add(instructor);
		userManager.add(student);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);;
		
		
		

		

	}

}
