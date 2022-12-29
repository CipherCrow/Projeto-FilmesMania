package br.com.filmesmania.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.filmesmania.services.ConverteJson;
import br.com.filmesmania.services.RealizaRequisicao;


@WebServlet("/controler")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		
		if(acao.equals("login")) {
			String chave = request.getParameter("chave");
			RequestDispatcher rd = request.getRequestDispatcher("/filmes.jsp");
			request.setAttribute("filmes", (chave));
			rd.forward(request,response);	
		}
		

	}
	

}
