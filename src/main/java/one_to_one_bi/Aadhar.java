package one_to_one_bi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Aadhar {
	@Id
	private int id;
	private long aadharNo;
	@OneToOne
	private User user;
	

}
