package org.hibernate.entities;


import javax.persistence.*;
@Entity
@Inheritance(strategy =InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "batch18",discriminatorType = DiscriminatorType.STRING)
@Table(name = "details1")
public class Student {

	@Id
	private int uid;
	private String name;
	
	
	public Student() {
		
	}

	public Student(int uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
	}
	
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
	
	@Override
	public String toString() {
		return "Student [uid=" + uid + ", name=" + name + "]";
	}
	
}

