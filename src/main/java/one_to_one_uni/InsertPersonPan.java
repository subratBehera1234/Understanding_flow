package one_to_one_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertPersonPan {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("subrat");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person person=new Person();
		person.setId(106);
		person.setName("chinki");
		person.setAge(21);
		person.setEmail("chinki@gmail.com");
		person.setPassword("7996");
		
		Pan pan=new Pan();
		pan.setId(206);
		pan.setPanNo("A88786TSVT&RT");
		
		person.setPan(pan);
		
		et.begin();
		em.persist(pan);
		em.persist(person);
		et.commit();
		
	}
}
