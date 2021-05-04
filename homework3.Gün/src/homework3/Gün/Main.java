package homework3.Gün;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.firsName = "Talha ";
		student.lastName = "Işıklı";
		student.address = "abcd ";
		student.course = "Java";
		
		
		Instructor instructor = new Instructor();
		instructor.firsName = "Engin ";
		instructor.lastName = "Demiroğ";
		
		
		UserManager userManager = new UserManager();
		userManager.add(instructor);
		userManager.add(student);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);;
		
		
		

		

	}

}
