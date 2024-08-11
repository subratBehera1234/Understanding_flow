package one_to_one_uni;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchPersonAndPan {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("subrat");
		EntityManager em=emf.createEntityManager();
		
		Person person=em.find(Person.class,103);
		
		System.out.println("Person Details :");
		System.out.println("Name :"+person.getName());
		System.out.println("Age :"+person.getAge());
		System.out.println("Email :"+person.getEmail());
		System.out.println("Password :"+person.getPassword()); 
		System.out.println("--------------------------");
		System.out.println("Pan Id :"+person.getPan().getId());
		System.out.println("Pan Number :"+person.getPan().getPanNo());
		
		Query query=em.createQuery("select p from Person p ");
		List<Person>list=query.getResultList();
		 
		for(Person p:list) {
			
			System.out.println("Person Details :");
			System.out.println("Name :"+p.getName());
			System.out.println("Age :"+p.getAge());
			System.out.println("Email :"+p.getEmail());
			System.out.println("Password :"+p.getPassword());
			System.out.println("--------------------------");
			System.out.println("Pan Id :"+p.getPan().getId());
			System.out.println("Pan Number :"+p.getPan().getPanNo());
			System.out.println("==============================");
			
		}
		
	}
}
