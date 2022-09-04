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
		
		//retrieve
		System.out.println("Enter the uid of the student");
		Student student1=new Student();
		//student.setUid(sc.nextInt());
		student1=service.getStudent(sc.nextInt());
		System.out.println(student1);
		
		//update
		System.out.println("Enter the details to update");
		int uid=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		Student student2=new Student(uid,name);
		student2=service.updateStudent(student2);
		System.out.println(student2);
		
		//Delete
		System.out.println("Enter the uid to delete");
		Student studelete=service.getStudent(sc.nextInt());
		service.deleteStudent(studelete);
		System.out.println("Student is deleted");
		
		

	}

}
