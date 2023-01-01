package br.com.filmesmania.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.filmesmania.services.ConverteJson;
import br.com.filmesmania.services.RealizaRequisicao;

public class Login implements Acao{
	
	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String chave = request.getParameter("chave");
		RealizaRequisicao requisicao = new RealizaRequisicao(chave);
		ConverteJson conversor = new ConverteJson(requisicao.buscarResposta());		
		request.setAttribute("filmes", conversor.pegarFilmes());
		
		return "forward:/filmes.jsp";	
	}
	
}
