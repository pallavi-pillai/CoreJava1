package c2tc.hibernate.service;

import c2tc.hibernate.entities.Student;
import c2tc.hibernate.repo.StudentRepo;
import c2tc.hibernate.repo.StudentRepoImpl;
import c2tc.hibernate.service.StudentService.StudentService;

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
