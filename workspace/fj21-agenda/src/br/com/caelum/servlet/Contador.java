package br.com.caelum.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Contador extends HttpServlet {
	private int contador = 0;
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		contador++;
		
		PrintWriter out = res.getWriter();
		
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		out.print("<html> <body> Oi Mundo!sao: " + data.format(Calendar.getInstance().getTime()) + " </body> </html>");
	}

}
