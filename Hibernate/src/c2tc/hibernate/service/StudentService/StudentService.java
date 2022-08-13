package c2tc.hibernate.service.StudentService;

import c2tc.hibernate.entities.Student;

public interface StudentService {

	void addStudent(Student student);

	Student getStudent(int nextInt);
}
