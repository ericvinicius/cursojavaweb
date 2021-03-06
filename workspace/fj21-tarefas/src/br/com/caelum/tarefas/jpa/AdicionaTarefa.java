package br.com.caelum.tarefas.jpa;

import java.util.Calendar;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefa;

public class AdicionaTarefa {

	public static void main(String[] args){
		Tarefa tarefa  = new Tarefa();
		tarefa.setDescricao("Estudar JPA  e Hibernate");
		tarefa.setFinalizado(true);
		tarefa.setDataFinalizacao(Calendar.getInstance());
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManagerFactory manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
	}
}
