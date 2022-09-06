package org.hibernate.service;

import org.hibernate.entities.Student;
import org.hibernate.repo.StudentRepo;
import org.hibernate.repo.StudentRepoImpl;

public class StudentServiceImpl implements StudentService {
	StudentRepo repo;
	
	public StudentServiceImpl(){
		repo=new StudentRepoImpl();
	}

	public void addStudent(Student student)
	{
		repo.startTransaction();
		repo.addStudent(student);
		repo.endTransaction();
	}

	@Override
	public Student getStudent(int rollno) {
		Student student=repo.getStudent(rollno);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		repo.startTransaction();
		Student s=repo.updateStudent(student);
		repo.endTransaction();
		return s;
	}

	@Override
	public void deleteStudent(Student studelete) {
		repo.startTransaction();
		repo.deleteStudent(studelete);
		repo.endTransaction();
		
	}
}