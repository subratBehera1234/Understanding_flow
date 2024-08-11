package one_to_one_uni;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Battery {

	@Id
	private int id;
	private int mah;

	
	
}
