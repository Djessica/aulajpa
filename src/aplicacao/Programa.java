package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		/*Pessoa p1 = new Pessoa("Teste", "teste@gmail.com",null);
		Pessoa p2 = new Pessoa("Teste 2", "teste2@gmail.com",null);
		Pessoa p3 = new Pessoa("Teste 3", "teste3@gmail.com",null);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);*/
		
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		//cria a conexao com o banco
		//EntityManager em = emf.createEntityManager();
		
		/*quando o jpa não vai somente ler do banco tem que ser iniciado uma transação com o banco*/
		//em.getTransaction().begin();
		
		/*em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		
		em.getTransaction().commit();*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");

		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class,1);
		
		em.getTransaction().begin();
		/* para remover dados do banco tem que ser antes de fechar a conexão e também logo após 
		 * inserir ou buscar informação no banco(entidades monitorada)*/
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println(p);
		System.out.println("Terminou");
		
		emf.close();
		em.close();

	}

}
