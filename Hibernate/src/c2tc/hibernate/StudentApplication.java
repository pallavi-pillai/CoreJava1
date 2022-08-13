package c2tc.hibernate;

import java.util.Scanner;

import c2tc.hibernate.entities.Student;
import c2tc.hibernate.service.StudentServiceImpl;
import c2tc.hibernate.service.StudentService.StudentService;

public class StudentApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentService service=new StudentServiceImpl();
		//To Add value
		System.out.println("Enter the details");
		Student student=new Student(sc.nextInt(),sc.next());
		service.addStudent(student);

	}

}
