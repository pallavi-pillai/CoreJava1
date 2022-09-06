package c2tc.hibernate;

import java.util.Scanner;

import c2tc.hibernate.entities.C2TC;
import c2tc.hibernate.entities.Student;
import c2tc.hibernate.service.StudentServiceImpl;
import c2tc.hibernate.service.StudentService.StudentService;

public class StudentApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentService service=new StudentServiceImpl();
		
		/*//To Add value
		System.out.println("Enter the details");
		//Student student=new Student(sc.nextInt(),sc.next());
		C2TC c2tcstudent=new C2TC(sc.nextInt(), //uid
								sc.next(), //name
								sc.next(), //ss Trainer name
								sc.next()); //tech Trainer name
		service.addStudent(c2tcstudent);
		System.out.println("Added successfully");*/
		
		/*//retrieve
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
		System.out.println("Student is deleted");*/
		
		//update c2tc
		C2TC c2tcstu=new C2TC();
		System.out.println("Enter the uid whose details are to update");
		c2tcstu.setUid(sc.nextInt());
		System.out.println("Enter the values to update");
		sc.nextLine();
		c2tcstu.setName(sc.nextLine());
		c2tcstu.setSsTrainerName(sc.next());
		c2tcstu.setTechTrainerName(sc.next());
		C2TC s=(C2TC) service.updateStudent(c2tcstu);
		System.out.println(s);
		

	}

}
