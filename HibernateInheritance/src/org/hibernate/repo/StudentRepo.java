package org.hibernate.repo;

import org.hibernate.entities.Student;

public interface StudentRepo {
	void addStudent(Student student);

	void startTransaction();

	void endTransaction();

	Student getStudent(int rollno);

	Student updateStudent(Student student);

	void deleteStudent(Student studelete);
}
