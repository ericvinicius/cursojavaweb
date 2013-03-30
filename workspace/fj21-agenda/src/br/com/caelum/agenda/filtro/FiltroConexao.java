package br.com.caelum.agenda.filtro;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import br.com.caelum.agenda.ConnectionFactory;

import com.mysql.jdbc.Connection;

public class FiltroConexao implements javax.servlet.Filter {
	public void doFilte(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		try{
			Connection connection = (Connection) new ConnectionFactory().getConnection();
			
			
			request.setAttribute("conexao", connection);
			
			chain.doFilter(request, response);
			
			connection.close();
		
		}catch(SQLException e){
			throw new ServletException(e);
		}
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
