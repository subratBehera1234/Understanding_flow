package one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertUserAadhar {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("subrat");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		User user=new User();
		user.setUserId(2);
		user.setName("dingi");
		user.setAge(21);
		
		Aadhar aadhar = new Aadhar();
		aadhar.setId(112);
		aadhar.setAadharNo(3333985623478l);
		
		user.setAadhar(aadhar);
		aadhar.setUser(user);
		
		et.begin();
		em.persist(aadhar);
		em.persist(user);
		et.commit();
		
	}
}
