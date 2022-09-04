package c2tc.hibernate.repo;

import c2tc.hibernate.entities.Student;

public interface StudentRepo {
	void addStudent(Student student);

	void startTransaction();

	void endTransaction();

	Student getStudent(int rollno);

	Student updateStudent(Student student);

	void deleteStudent(Student studelete);
}
