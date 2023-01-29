package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student Name is Vishnupriya");
	}

	public void studentDept() {
		System.out.println("Student belongs to Information Technology Department");
	}

	public void studentId() {
		System.out.println("Student Id is 3114162060");
	}
	
	public static void main(String[] args) {
		 
		Student stud = new Student();
		//Calling methods of College (base class)
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		
		//Calling methods from Department Class
		stud.departmentName();
		
		//Calling methods from Student class
		stud.studentName();
		stud.studentDept();
		stud.studentId();
	}

}
