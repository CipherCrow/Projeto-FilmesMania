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


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String chave = request.getParameter("chave");
		RealizaRequisicao requisicao = new RealizaRequisicao(chave);
		ConverteJson conversor = new ConverteJson(requisicao.buscarResposta());		
	
		RequestDispatcher rd = request.getRequestDispatcher("/filmes.jsp");
		request.setAttribute("filmes", conversor.pegarFilmes());
		rd.forward(request,response);

	}
	

}
