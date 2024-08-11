package one_to_one_uni;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Mobile {

	@Id
	private int id;
	private String brand;
	@OneToOne
	private Battery battery;

	
}
