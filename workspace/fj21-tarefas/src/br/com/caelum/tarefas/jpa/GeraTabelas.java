package br.com.caelum.tarefas.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class GeraTabelas {

	public static void main(String[] args){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		
		factory.close();
	}
}
