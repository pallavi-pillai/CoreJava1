package org.hibernate.service;

import org.hibernate.entities.Student;

public interface StudentService {
	void addStudent(Student student);

	Student getStudent(int nextInt);

	Student updateStudent(Student student);

	

	void deleteStudent(Student studelete);
}
