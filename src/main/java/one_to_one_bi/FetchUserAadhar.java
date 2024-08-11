package one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchUserAadhar {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("subrat");
		EntityManager em=emf.createEntityManager();
		
		User user = em.find(User.class,1);
		Aadhar aadhar=em.find(Aadhar.class, 111);
		
		System.out.println("Aadhar Id :"+user.getAadhar().getId());
		System.out.println("Adhar details :"+user.getAadhar().getAadharNo());
		System.out.println("------------------------");
		System.out.println("User Id :"+aadhar.getUser().getUserId());
		System.out.println("User Name :"+aadhar.getUser().getName());
		System.out.println("User Age :"+aadhar.getUser().getAge());
	}
	
}
