package br.com.caelum.tarefas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.tarefas.dao.JdbcTarefaDao;
import br.com.caelum.tarefas.modelo.Tarefa;

@Controller
public class TarefasController {
	
	@RequestMapping("novaTarefa")
	public String form(){
		return "tarefa/formulario";
	}
	
	@RequestMapping("adicionaTarefa")
	public String adiciona(@Valid Tarefa tarefa, BindingResult result){
		
		if(result.hasFieldErrors("descricao")){
			return "tarefa/formulario";
		}
		
		JdbcTarefaDao DAO = new JdbcTarefaDao();
		DAO.adiciona(tarefa);
		return "tarefa/adicionada";
	}
	
	@RequestMapping("listaTarefas")
	public String lista(Model model){
		JdbcTarefaDao DAO = new JdbcTarefaDao();
		model.addAttribute("tarefas", DAO.lista());
		return "tarefa/lista";
	}
	
	@RequestMapping("removeTarefa")
	public String remove(Tarefa tarefa){
		JdbcTarefaDao DAO = new JdbcTarefaDao();
		DAO.remove(tarefa);
		return "redirect:listaTarefas";
	}
	
	@RequestMapping("mostraTarefa")
	public String mostra(Long id, Model model){
		JdbcTarefaDao DAO = new JdbcTarefaDao();
		model.addAttribute("tarefa", DAO.buscaPorId(id));
		return "tarefa/mostra";
	}
	
	@RequestMapping("alteraTarefa")
	public String altera(Tarefa tarefa){
		JdbcTarefaDao DAO = new JdbcTarefaDao();
		DAO.altera(tarefa);
		return "redirect:listaTarefas";
	}
	
}
