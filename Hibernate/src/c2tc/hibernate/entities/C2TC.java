package c2tc.hibernate.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="c2tcStudent")

public class C2TC extends Student {
	private String ssTrainerName;
	private String techTrainerName;
	
	public C2TC(int uid, String name, String ssTrainerName, String techTrainerName) {
		super(uid, name);
		this.ssTrainerName = ssTrainerName;
		this.techTrainerName = techTrainerName;
	}
	public C2TC() {
		// TODO Auto-generated constructor stub
	}
	public String getSsTrainerName() {
		return ssTrainerName;
	}
	public void setSsTrainerName(String ssTrainerName) {
		this.ssTrainerName = ssTrainerName;
	}
	public String getTechTrainerName() {
		return techTrainerName;
	}
	public void setTechTrainerName(String techTrainerName) {
		this.techTrainerName = techTrainerName;
	}
	
	
}
