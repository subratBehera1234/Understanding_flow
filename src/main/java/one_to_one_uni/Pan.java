package one_to_one_uni;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pan {

	@Id
	private int id;
	private String panNo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	
}
