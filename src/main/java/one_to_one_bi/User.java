package one_to_one_bi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

	@Id
	private int userId;
	private String name;
	private int age;
	@OneToOne
	private Aadhar aadhar;
}
