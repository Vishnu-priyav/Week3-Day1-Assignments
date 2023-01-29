package org.students1;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("The Student id is "+ id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("The Student id is "+ id + " Student name is:"+ name);
	}
	
	public void getStudentInfo(String email, String number) {
		System.out.println("Email id : "+ email + " \tphone Number:"+ number);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students stud = new Students();
		stud.getStudentInfo(5);
		stud.getStudentInfo(5, "Vishnupriya");
		stud.getStudentInfo("Vishnupriya@gmail.com", "9840654239");

	}

}
