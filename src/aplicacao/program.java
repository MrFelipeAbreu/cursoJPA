package aplicacao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class program {

	public static void main(String[] args) {
//		Pessoa p1 = new Pessoa(null, "Felipe Abreu", "fgnabreu@gmail.com");
//		Pessoa p2 = new Pessoa(null, "Aline Abreu", "aline.cs.abreu@gmail.com");
//		Pessoa p3 = new Pessoa(null, "Artur Abreu", "artur.cs.abreu@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);

//		
		Pessoa p = em.find(Pessoa.class, 3);
//		
//		System.out.println(p);
		
		em.remove(p);
		em.getTransaction().commit();
		em.close();
		emf.close();
		

		
		System.out.println("Finalizado!!!");

	}

}
