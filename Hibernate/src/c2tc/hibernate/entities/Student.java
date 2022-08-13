package c2tc.hibernate.entities;
import javax.persistence.*;

@Entity
@Table(name="details")
public class Student {
	@Id
	private int uid;
	@Column(name="student_name")
	private String name;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [uid=" + uid + ", name=" + name + "]";
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
}
