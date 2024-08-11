package one_to_one_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MobileUser {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("subrat");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Mobile mobile=new Mobile();
		mobile.setId(1206);
		mobile.setBrand("nokia");
		
		Battery battery =new Battery();
		battery.setId(16);
		battery.setMah(1250);
		mobile.setBattery(battery);
		
		et.begin();
		em.persist(battery);
		em.persist(mobile);
		et.commit();
		
	}

}
