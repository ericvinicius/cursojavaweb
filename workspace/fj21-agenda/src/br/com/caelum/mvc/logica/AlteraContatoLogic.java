package br.com.caelum.mvc.logica;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDAO;
import br.com.caelum.agenda.modelo.Contato;

public class AlteraContatoLogic {
	public void executa(HttpServletRequest req, HttpServletResponse res) throws Exception{
		
		Contato contato = new Contato();
		long id = Long.parseLong(req.getParameter("id"));
		contato.setId(id);
		contato.setNome(req.getParameter("nome"));
		contato.setEndereco(req.getParameter("endereco"));
		contato.setEmail(req.getParameter("email"));
		
		String dataEmTexto = req.getParameter("dataNascimento");
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(date);
		
		contato.setDataNascimento(dataNascimento);
		
		ContatoDAO DAO = new ContatoDAO();
		DAO.atualiza(contato);
		
		RequestDispatcher rd = req.getRequestDispatcher("/lista-contatos-elegante.jsp");
		rd.forward(req, res);
		System.out.println("Alterando contato..." + contato.getNome());
	
	}
}
